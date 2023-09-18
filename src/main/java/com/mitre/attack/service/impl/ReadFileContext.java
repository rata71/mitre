package com.mitre.attack.service.impl;

import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;
import com.mitre.attack.service.ReadFileStrategy;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReadFileContext implements InitializingBean {

  private Map<FileType, ReadFileStrategy> map;

  @Override
  public void afterPropertiesSet() {
    this.map = new HashMap<>();
    map.put(FileType.FILE, new ReadFileStrategyFile());
    map.put(FileType.CURL, new ReadFileStrategyCurl());
  }

  public StringBuilder read(FileType fileType) {
    if (!FileType.exists(fileType)) {
      return new StringBuilder();
    }
    try {
      return map.get(fileType).read();
    } catch (AttackException ae) {
      log.error("Error reading : {} ", ae.getMessage(), ae);
    }
    return null;
  }
}
