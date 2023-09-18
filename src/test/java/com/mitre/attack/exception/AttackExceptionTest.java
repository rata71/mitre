package com.mitre.attack.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class AttackExceptionTest {

  @Test
  void testConstructor() {
    AttackException actualAttackException = new AttackException("An error occurred");
    assertNull(actualAttackException.getCause());
    assertEquals(0, actualAttackException.getSuppressed().length);
    assertEquals("An error occurred", actualAttackException.getMessage());
    assertEquals("An error occurred", actualAttackException.getLocalizedMessage());
  }



  @Test
  void testConstructor2() {
    Throwable exception = new Throwable();
    AttackException actualAttackException = new AttackException("An error occurred", exception);

    Throwable cause = actualAttackException.getCause();
    assertSame(exception, cause);
    Throwable[] suppressed = actualAttackException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("An error occurred", actualAttackException.getLocalizedMessage());
    assertEquals("An error occurred", actualAttackException.getMessage());
    assertNull(cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertNull(cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
  }
}
