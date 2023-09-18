package com.mitre.attack.service.impl;

import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.service.ReadFileStrategy;
import java.io.*;
import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReadFileStrategyFile implements ReadFileStrategy {

  @Override
  public FileType getType() {
    return FileType.FILE;
  }

  @Override
  public StringBuilder read() {
    String fileName =
        "static/raw.githubusercontent.com_mitre_cti_master_enterprise-attack_enterprise-attack.json";
    StringBuilder data = new StringBuilder();

    try {
      ClassLoader classLoader = getClass().getClassLoader();
      File file = new File(classLoader.getResource(fileName).getFile());
      InputStream inputStream = new FileInputStream(file);

      InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
      BufferedReader reader = new BufferedReader(streamReader);
      for (String line; (line = reader.readLine()) != null; ) {
        data.append(line);
      }
      reader.close();

    } catch (IOException e) {
      data = new StringBuilder();
      log.error("Error reading file " + e.getMessage());
    }
    return data;
  }
}
