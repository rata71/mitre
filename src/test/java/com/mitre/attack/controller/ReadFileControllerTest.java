package com.mitre.attack.controller;

import com.mitre.attack.service.impl.ReadFileContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReadFileControllerTest {

  @Test
  void testConstructor() {
    ReadFileContext readFileContext = new ReadFileContext();

    ReadFileController actualReadFileController = new ReadFileController(readFileContext);

    assertNotNull(actualReadFileController);
  }
}
