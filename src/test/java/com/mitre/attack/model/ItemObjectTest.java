package com.mitre.attack.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

//@ExtendWith(MockitoExtension.class)
//@DataJpaTest
class ItemObjectTest {

  @Autowired private TestEntityManager entityManager;

  private ItemObject itemObject;

  @BeforeEach
  void setUp() {
    itemObject = new ItemObject();
    itemObject.setObjectId("42");
  }

  @Test
  void testConstructorsAndGettersAndSetters() {
    // Arrange
    ItemObject itemObject2 = new ItemObject("43");

    itemObject.setId(1L);
    Long actualId = itemObject.getId();
    String actualObjectId = itemObject.getObjectId();
    Long actualId2 = itemObject2.getId();
    String actualObjectId2 = itemObject2.getObjectId();

    assertThat(actualId).isEqualTo(1L);
    assertThat(actualObjectId).isEqualTo("42");
    assertThat(actualId2).isNull();
    assertThat(actualObjectId2).isEqualTo("43");
  }


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
