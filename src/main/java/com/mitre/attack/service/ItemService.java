package com.mitre.attack.service;

import com.mitre.attack.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ItemService {
  public Item createItem(Item item);

  public Page<Item> getAll(String name, Pageable pageable);

  public Optional<Item> findById(String id);
}
