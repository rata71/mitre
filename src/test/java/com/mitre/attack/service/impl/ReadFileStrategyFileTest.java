package com.mitre.attack.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mitre.attack.data.enums.FileType;
import org.junit.jupiter.api.Test;

class ReadFileStrategyFileTest {
  @Test
  void testGetType() {
    assertEquals(FileType.FILE, (new ReadFileStrategyFile()).getType());
  }
}
