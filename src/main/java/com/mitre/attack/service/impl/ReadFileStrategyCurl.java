package com.mitre.attack.service.impl;

import com.mitre.attack.data.enums.FileType;
import com.mitre.attack.exception.AttackException;
import com.mitre.attack.service.ReadFileStrategy;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReadFileStrategyCurl implements ReadFileStrategy {

  @Override
  public FileType getType() {
    return FileType.CURL;
  }

  @Override
  public StringBuilder read() throws AttackException {
    StringBuilder data = new StringBuilder();
    try {
      URL url =
          new URL(
              "https://raw.githubusercontent.com/mitre/cti/master/enterprise-attack/enterprise-attack.json");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.connect();

      int responseCode = conn.getResponseCode();
      if (responseCode != 200) {
        throw new AttackException("Execution error : " + responseCode);
      } else {
        Scanner scanner = new Scanner(url.openStream());

        while (scanner.hasNext()) {
          log.info("Reading from JSON server");
          data.append(scanner.nextLine());
        }
        scanner.close();
      }
      return data;
    } catch (IOException ioe) {
      log.error("Error reading curl " + ioe.getMessage());
    }
    return data;
  }
}
