package com.mitre.attack.repository;

import com.mitre.attack.model.Item;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = {ItemRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.mitre.attack.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class ItemRepositoryTest {
  @Autowired private ItemRepository itemRepository;

  @Test
  void testFindAllByNameLike() {
    String name = "";
    Pageable pageable = null;

    Page<Item> actualFindAllByNameLikeResult =
        this.itemRepository.findAllByNameLike(name, pageable);

    assertEquals(0, actualFindAllByNameLikeResult.getTotalElements());
  }
}
