package org.flow;

import org.testng.annotations.Test;

public class FailedTest {

  @Test
  public void retryTest() {
    throw new RuntimeException("Test not implemented");
  }
}
