package com.mitre.attack.data.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DefinitionTest {
  @Test
  void testSetStatement() {
    Definition definition = new Definition();
    definition.setStatement("MD");
    assertEquals("MD", definition.getStatement());
  }
}
