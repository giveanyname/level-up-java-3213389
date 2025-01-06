package com.linkedin.javacodechallenges;

public class Person {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if(this.age < age) {
    this.age = age;
    }
  }

  public void printPersonInfo() {
    System.out.println("Name: " + getName() + " Age: " + getAge());
  }
  
}