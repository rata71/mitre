package com.mitre.attack.data.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KillChainPhasesTest {

  @Test
  void testSetKillChainName() {
    KillChainPhases killChainPhases = new KillChainPhases();
    killChainPhases.setKillChainName("Kill Chain Name");
    killChainPhases.setPhaseName("Phase Name");
    String actualKillChainName = killChainPhases.getKillChainName();
    assertEquals("Kill Chain Name", actualKillChainName);
    assertEquals("Phase Name", killChainPhases.getPhaseName());
  }
}
