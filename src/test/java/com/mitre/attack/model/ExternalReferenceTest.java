package com.mitre.attack.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExternalReferenceTest {

  @Test
  void testConstructor() {
    ExternalReference actualExternalReference = new ExternalReference();
    actualExternalReference.setDescription("The characteristics of someone or something");
    actualExternalReference.setExternalId("42");
    actualExternalReference.setId(1L);
    actualExternalReference.setSourceName("Source Name");
    actualExternalReference.setUrl("https://example.org/example");
    String actualDescription = actualExternalReference.getDescription();
    String actualExternalId = actualExternalReference.getExternalId();
    Long actualId = actualExternalReference.getId();
    String actualSourceName = actualExternalReference.getSourceName();
    String actualUrl = actualExternalReference.getUrl();
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("42", actualExternalId);
    assertEquals(1L, actualId.longValue());
    assertEquals("Source Name", actualSourceName);
    assertEquals("https://example.org/example", actualUrl);
  }

  @Test
  void testConstructor2() {
    ExternalReference actualExternalReference =
        new ExternalReference(
            1L,
            "Source Name",
            "https://example.org/example",
            "42",
            "The characteristics of someone or something");
    actualExternalReference.setDescription("The characteristics of someone or something");
    actualExternalReference.setExternalId("42");
    actualExternalReference.setId(1L);
    actualExternalReference.setSourceName("Source Name");
    actualExternalReference.setUrl("https://example.org/example");
    String actualDescription = actualExternalReference.getDescription();
    String actualExternalId = actualExternalReference.getExternalId();
    Long actualId = actualExternalReference.getId();
    String actualSourceName = actualExternalReference.getSourceName();
    String actualUrl = actualExternalReference.getUrl();
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("42", actualExternalId);
    assertEquals(1L, actualId.longValue());
    assertEquals("Source Name", actualSourceName);
    assertEquals("https://example.org/example", actualUrl);
  }

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
    assertEquals(1L, actualId);
    assertEquals("Source Name", actualSourceName);
    assertEquals("https://example.org/example", actualUrl);
  }
}
