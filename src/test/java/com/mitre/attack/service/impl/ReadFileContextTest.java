package com.mitre.attack.service.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.mitre.attack.data.enums.FileType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ReadFileContext.class})
@ExtendWith(SpringExtension.class)
class ReadFileContextTest {
  @Autowired private ReadFileContext readFileContext;

  @Test
  void testRead() {
    assertNotNull(readFileContext.read(FileType.CURL));
  }


  @Test
  void testRead2() {
    assertNotNull(readFileContext.read(FileType.FILE));
  }

}
