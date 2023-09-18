package com.mitre.attack.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExternalReferenceTest {

  @Test
  void testSetExternalId() {
    ExternalReference externalReference = new ExternalReference();
    externalReference.setExternalId("42");
    externalReference.setId(1L);
    externalReference.setSourceName("Source Name");
    externalReference.setUrl("https://example.org/example");
    String actualExternalId = externalReference.getExternalId();
    Long actualId = externalReference.getId();
    String actualSourceName = externalReference.getSourceName();
    String actualUrl = externalReference.getUrl();
    assertEquals("42", actualExternalId);
    assertEquals(1L, actualId.longValue());
    assertEquals("Source Name", actualSourceName);
    assertEquals("https://example.org/example", actualUrl);
  }
}
