package com.askattest.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class RunTest {
  @Test
  public void testGetHelloWorld() throws Exception {
    assertEquals("Hello world!", Run.getHelloWorld());
  }
}
