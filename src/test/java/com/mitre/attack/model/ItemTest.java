package com.mitre.attack.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ItemTest {


  @Test
  void testSetCreated1() {
    Item item = new Item();
    LocalDateTime created = LocalDate.of(1970, 1, 1).atStartOfDay();
    item.setCreated(created);
    item.setCreatedByRef("Sep 18, 2023 8:00am GMT+0100");
    item.setDescription("The characteristics of someone or something");
    ArrayList<ExternalReference> externalReferences = new ArrayList<>();
    item.setExternalReferences(externalReferences);
    item.setId(1L);
    LocalDateTime modified = LocalDate.of(1970, 1, 1).atStartOfDay();
    item.setModified(modified);
    item.setName("Name");
    ArrayList<ItemObject> objectMarkingRefs = new ArrayList<>();
    item.setObjectMarkingRefs(objectMarkingRefs);
    item.setType("Type");
    item.setXMitreDeprecated(true);
    ArrayList<ItemObject> xMitreDomains = new ArrayList<>();
    item.setXMitreDomains(xMitreDomains);
    ArrayList<ItemObject> xMitreModifiedByRef = new ArrayList<>();
    item.setXMitreModifiedByRef(xMitreModifiedByRef);
    ArrayList<ItemObject> xMitreVersion = new ArrayList<>();
    item.setXMitreVersion(xMitreVersion);
    LocalDateTime actualCreated = item.getCreated();
    String actualCreatedByRef = item.getCreatedByRef();
    String actualDescription = item.getDescription();
    List<ExternalReference> actualExternalReferences = item.getExternalReferences();
    Long actualId = item.getId();
    LocalDateTime actualModified = item.getModified();
    String actualName = item.getName();
    List<ItemObject> actualObjectMarkingRefs = item.getObjectMarkingRefs();
    String actualType = item.getType();
    Boolean actualXMitreDeprecated = item.getXMitreDeprecated();
    List<ItemObject> actualXMitreDomains = item.getXMitreDomains();
    List<ItemObject> actualXMitreModifiedByRef = item.getXMitreModifiedByRef();
    List<ItemObject> actualXMitreVersion = item.getXMitreVersion();
    assertSame(created, actualCreated);
    assertEquals("Sep 18, 2023 8:00am GMT+0100", actualCreatedByRef);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertSame(externalReferences, actualExternalReferences);
    assertEquals(objectMarkingRefs, actualExternalReferences);
    assertEquals(xMitreDomains, actualExternalReferences);
    assertEquals(xMitreModifiedByRef, actualExternalReferences);
    assertEquals(xMitreVersion, actualExternalReferences);
    assertEquals(1L, actualId.longValue());
    assertSame(modified, actualModified);
    assertEquals("Name", actualName);
    assertSame(objectMarkingRefs, actualObjectMarkingRefs);
    assertEquals(xMitreDomains, actualObjectMarkingRefs);
    assertEquals(xMitreModifiedByRef, actualObjectMarkingRefs);
    assertEquals(xMitreVersion, actualObjectMarkingRefs);
    assertEquals(actualExternalReferences, actualObjectMarkingRefs);
    assertEquals("Type", actualType);
    assertTrue(actualXMitreDeprecated);
    assertSame(xMitreDomains, actualXMitreDomains);
    assertEquals(xMitreModifiedByRef, actualXMitreDomains);
    assertEquals(xMitreVersion, actualXMitreDomains);
    assertEquals(actualExternalReferences, actualXMitreDomains);
    assertEquals(actualObjectMarkingRefs, actualXMitreDomains);
    assertSame(xMitreModifiedByRef, actualXMitreModifiedByRef);
    assertEquals(xMitreVersion, actualXMitreModifiedByRef);
    assertEquals(actualExternalReferences, actualXMitreModifiedByRef);
    assertEquals(actualObjectMarkingRefs, actualXMitreModifiedByRef);
    assertEquals(actualXMitreDomains, actualXMitreModifiedByRef);
    assertSame(xMitreVersion, actualXMitreVersion);
    assertEquals(actualExternalReferences, actualXMitreVersion);
    assertEquals(actualObjectMarkingRefs, actualXMitreVersion);
    assertEquals(actualXMitreDomains, actualXMitreVersion);
    assertEquals(actualXMitreModifiedByRef, actualXMitreVersion);
  }


}
