package com.mitre.attack.data.dto;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObjectsTest {

  @Test
  void testGettersAndSetters() {
    Objects objects = new Objects();

    objects.setId("123");
    objects.setName("Test Object");
    objects.setDescription("This is a test object");

    Assertions.assertEquals("123", objects.getId());
    Assertions.assertEquals("Test Object", objects.getName());
    Assertions.assertEquals("This is a test object", objects.getDescription());
  }

  @Test
  void testExternalReferences() {
    List<ExternalReference> externalReferences = new ArrayList<>();
    ExternalReference reference1 = new ExternalReference();
    reference1.setSourceName("Source 1");
    reference1.setUrl("https://example.com/1");
    externalReferences.add(reference1);

    ExternalReference reference2 = new ExternalReference();
    reference2.setSourceName("Source 2");
    reference2.setUrl("https://example.com/2");
    externalReferences.add(reference2);

    Objects objects = new Objects();
    objects.setExternalReferences(externalReferences);

    Assertions.assertEquals(2, objects.getExternalReferences().size());

    Assertions.assertEquals("Source 1", objects.getExternalReferences().get(0).getSourceName());
    Assertions.assertEquals(
        "https://example.com/1", objects.getExternalReferences().get(0).getUrl());

    Assertions.assertEquals("Source 2", objects.getExternalReferences().get(1).getSourceName());
    Assertions.assertEquals(
        "https://example.com/2", objects.getExternalReferences().get(1).getUrl());
  }
}
