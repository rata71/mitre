package com.mitre.attack;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.mitre.attack.service.impl.ItemServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = AttackApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ActiveProfiles("test")
class AttackApplicationTest {

  @MockBean private ItemServiceImpl itemService;

  private AttackApplication attackApplication;

  @Autowired private ApplicationContext applicationContext;

  @BeforeEach
  public void setup() {
    attackApplication = new AttackApplication();
    Mockito.reset(itemService);
  }

  @Test
  void testMainWhenApplicationStartsThenLoadsSuccessfully() {
    assertNotNull(applicationContext, "The application context should have been loaded");
  }
}
