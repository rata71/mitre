package com.mitre.attack.data.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileTypeTest {

  @Test
  void testExistsWhenFileTypeExistsThenReturnTrue() {
    FileType fileType = FileType.CURL;

    boolean result = FileType.exists(fileType);

    assertTrue(result, "Expected method to return true when FileType exists");
  }
}
