package com.mitre.attack.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ItemObjectTest {


  @Test
  void testSetId() {
    ItemObject itemObject = new ItemObject();
    itemObject.setId(1L);
    itemObject.setObjectId("42");
    Long actualId = itemObject.getId();
    String actualObjectId = itemObject.getObjectId();
    assertEquals(1L, actualId.longValue());
    assertEquals("42", actualObjectId);
  }
}
