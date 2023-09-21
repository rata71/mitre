package com.mitre.attack.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mitre.attack.data.dto.Objects;
import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;
import com.mitre.attack.model.Item;
import com.mitre.attack.repository.ItemRepository;
import com.mitre.attack.service.ItemService;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ItemServiceImpl implements ItemService {

  @Autowired private ItemRepository itemRepository;

  @Autowired private ReadFileContext readFileContext;

  private ModelMapper modelMapper;

  public Item createItem(Item item) {
    return itemRepository.save(item);
  }

  public Page<Item> getAll(String name, Pageable pageable) {
    if (name == null || name.isEmpty()) {
      return itemRepository.findAll(pageable);
    } else {
      return itemRepository.findAllByNameLike("%" + name + "%", pageable);
    }
  }

  public void loadData() throws AttackException {

    ObjectMapper objectMapper = new ObjectMapper();

    StringBuilder data = readFileContext.read(FileType.FILE);
    log.info("Readed {} bytes", data.length());

    JsonNode root = null;
    AtomicInteger recCount = new AtomicInteger();
    try {
      root = objectMapper.readTree(String.valueOf(data));
      root.get("objects")
          .forEach(
              obj -> {
                try {
                  Objects object = new ObjectMapper().readValue(obj.toString(), Objects.class);

                  Item item = new Item(object);
                  log.info("RECORD : " + (recCount.getAndIncrement()));
                  itemRepository.save(item);

                } catch (JsonProcessingException e) {
                  throw new RuntimeException(e);
                }
              });

    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public Optional<Item> findById(String id) {
    if (id == null || id.isEmpty()) {
      return Optional.empty();
    }
    return itemRepository.findByObjectId(id);
  }
}
