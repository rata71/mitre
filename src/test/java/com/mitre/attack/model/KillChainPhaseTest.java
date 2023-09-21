package com.mitre.attack.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KillChainPhaseTest {

  @Test
  void testConstructor() {
    KillChainPhase actualKillChainPhase = new KillChainPhase();
    actualKillChainPhase.setId(1L);
    actualKillChainPhase.setKillChainName("Kill Chain Name");
    actualKillChainPhase.setPhaseName("Phase Name");
    Long actualId = actualKillChainPhase.getId();
    String actualKillChainName = actualKillChainPhase.getKillChainName();
    String actualPhaseName = actualKillChainPhase.getPhaseName();
    assertEquals(1L, actualId.longValue());
    assertEquals("Kill Chain Name", actualKillChainName);
    assertEquals("Phase Name", actualPhaseName);
  }

  @Test
  void testConstructor2() {
    KillChainPhase actualKillChainPhase = new KillChainPhase(1L, "Kill Chain Name", "Phase Name");
    actualKillChainPhase.setId(1L);
    actualKillChainPhase.setKillChainName("Kill Chain Name");
    actualKillChainPhase.setPhaseName("Phase Name");
    Long actualId = actualKillChainPhase.getId();
    String actualKillChainName = actualKillChainPhase.getKillChainName();
    String actualPhaseName = actualKillChainPhase.getPhaseName();
    assertEquals(1L, actualId.longValue());
    assertEquals("Kill Chain Name", actualKillChainName);
    assertEquals("Phase Name", actualPhaseName);
  }
}
