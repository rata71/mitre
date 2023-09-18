package com.mitre.attack.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;
import com.mitre.attack.model.Item;
import com.mitre.attack.repository.ItemRepository;
import com.mitre.attack.service.ItemService;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ItemServiceImpl implements ItemService {

  @Autowired private ItemRepository itemRepository;

  @Autowired private ReadFileContext readFileContext;

  public Item createItem(Item item) {
    return itemRepository.save(item);
  }

  public Page<Item> getAll(String name, Pageable pageable) {
    if (name == null || name.isEmpty()) {
      return itemRepository.findAll(pageable);
    } else {
      return itemRepository.findAllByNameLike(name, pageable);
    }
  }

  public void loadData() throws AttackException {
    ObjectMapper mapper = new ObjectMapper();

    StringBuilder data = readFileContext.read(FileType.FILE);
    log.info("Readed {} bytes", data.length());

    try {
      Item item = mapper.readValue(data.toString(), Item.class);
      log.info(item.getCreatedByRef());
    } catch (JsonProcessingException jpe) {
      log.error("Error parsing JSON: {}", jpe.getMessage(), jpe);
    }

    // JSONArray jsonArray = new JSONArray(information.toString());

  }
}
