package com.mitre.attack.web;

import com.mitre.attack.exception.AttackException;
import com.mitre.attack.model.Item;
import com.mitre.attack.service.impl.ItemServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("attack/tactics")
public class AttackTacticsController {

  @Autowired private ItemServiceImpl itemService;

  @PostMapping
  public void loadData() {
    try {
      itemService.loadData();
    } catch (AttackException ae) {
      log.error("ERROR: {}", ae.getMessage());
    }
  }

  @GetMapping
  public Page<Item> getAll(@RequestParam(required = false) String name, @PageableDefault(page = 0, size = 10) Pageable pageable) {
    return itemService.getAll(name, pageable);
  }

  @GetMapping("{id}")
  public Item searchById(@PathVariable("id") Long id) {
    return null;
  }
}
