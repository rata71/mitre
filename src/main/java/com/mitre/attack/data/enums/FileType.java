package com.mitre.attack.data.enums;

import java.util.Arrays;

public enum FileType {
  CURL,
  FILE;

  public static boolean exists(FileType fileType) {
    return Arrays.stream(FileType.values()).anyMatch(fileType::equals);
  }
}
