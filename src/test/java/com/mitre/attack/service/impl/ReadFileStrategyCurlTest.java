package com.mitre.attack.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ReadFileStrategyCurl.class})
@ExtendWith(SpringExtension.class)
class ReadFileStrategyCurlTest {
  @Autowired private ReadFileStrategyCurl readFileStrategyCurl;

  @Test
  void testGetType() {
    assertEquals(FileType.CURL, (new ReadFileStrategyCurl()).getType());
  }

  @Test
  void testRead() throws AttackException {
    assertNotNull(readFileStrategyCurl.read());
  }
}