package com.mitre.attack.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DefinitionTest {
  @Test
  void testConstructor() {
    Definition actualDefinition = new Definition();
    actualDefinition.setStatement("MD");
    assertEquals("MD", actualDefinition.getStatement());
  }

  @Test
  void testConstructor2() {
    Definition actualDefinition = new Definition("MD");
    actualDefinition.setStatement("MD");
    assertEquals("MD", actualDefinition.getStatement());
  }
}
