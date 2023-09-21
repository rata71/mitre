package com.mitre.attack.service.impl;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;

import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;
import com.mitre.attack.model.Item;
import com.mitre.attack.repository.ItemRepository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ItemServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ItemServiceImplTest {
  @MockBean private ItemRepository itemRepository;

  @Autowired private ItemServiceImpl itemServiceImpl;

  @MockBean private ReadFileContext readFileContext;

  @Test
  void testCreateItem() {
    Item item = new Item();
//    item.setCreated(LocalDate.of(1970, 1, 1).atStartOfDay());
    item.setCreated("2023-01-01T10:00:00Z");
    item.setCreatedByRef("Sep 18, 2023 8:00am GMT+0100");
    item.setDescription("The characteristics of someone or something");
    item.setExternalReferences(new ArrayList<>());
    item.setObjectId("1");
//    item.setModified(LocalDate.of(1970, 1, 1).atStartOfDay());
    item.setModified("2023-01-01T10:00:00Z");
    item.setName("Name");
    item.setObjectMarkingRefs(new ArrayList<>());
    item.setType("Type");
    item.setXMitreDeprecated(true);
    item.setXMitreDomains(new ArrayList<>());
    item.setXMitreModifiedByRef("X1");
    item.setXMitreVersion("1.0");
    when(itemRepository.save(Mockito.<Item>any())).thenReturn(item);

    Item item2 = new Item();
//    item2.setCreated(LocalDate.of(1970, 1, 1).atStartOfDay());
    item2.setCreated("2023-01-01T10:00:00Z");
    item2.setCreatedByRef("Sep 18, 2023 8:00am GMT+0100");
    item2.setDescription("The characteristics of someone or something");
    item2.setExternalReferences(new ArrayList<>());
    item2.setObjectId("1");
//    item2.setModified(LocalDate.of(1970, 1, 1).atStartOfDay());
    item2.setModified("2023-01-01T10:00:00Z");
    item2.setName("Name");
    item2.setObjectMarkingRefs(new ArrayList<>());
    item2.setType("Type");
    item2.setXMitreDeprecated(true);
    item2.setXMitreDomains(new ArrayList<>());
    item2.setXMitreModifiedByRef("X1");
    item2.setXMitreVersion("1.0");
    assertSame(item, itemServiceImpl.createItem(item2));
    verify(itemRepository).save(Mockito.<Item>any());
  }

  @Test
  void testGetAll() {
    Page<Item> page = itemServiceImpl.getAll(null, null);
    assertNull(page);

    page = itemServiceImpl.getAll("Anything", null);
    assertNull(page);

  }



  @Test
  void testLoadData() throws AttackException {
    ItemServiceImpl itemServiceImpl = mock(ItemServiceImpl.class);
    when(readFileContext.read(FileType.FILE)).thenReturn(new StringBuilder("Test"));
    itemServiceImpl.loadData();
    verify(itemServiceImpl, times(1)).loadData();
  }

}
