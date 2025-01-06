package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

  @Test
  public void testcase1() {
  Person p1 = new Person("Sri", 20);
  assertEquals(p1.getName(), "Sri");
  assertEquals(p1.getAge(), 20);
  p1.setName("Sree");
  p1.setAge(19);
  assertEquals(p1.getName(), "Sree");
  assertEquals(p1.getAge(), 20);
}
  
  
}
