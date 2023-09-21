package com.mitre.attack.data.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExternalReferenceTest {

  @Test
  void testSetDescription() {
    ExternalReference externalReference = new ExternalReference();
    externalReference.setDescription("The characteristics of someone or something");
    externalReference.setExternalId("42");
    externalReference.setSourceName("Source Name");
    externalReference.setUrl("https://example.org/example");
    String actualDescription = externalReference.getDescription();
    String actualExternalId = externalReference.getExternalId();
    String actualSourceName = externalReference.getSourceName();
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals("42", actualExternalId);
    assertEquals("Source Name", actualSourceName);
    assertEquals("https://example.org/example", externalReference.getUrl());
  }
}
