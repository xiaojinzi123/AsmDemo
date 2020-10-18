package com.test;

public class TestClass {

    private String name = "hello";

    public TestClass(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("name = " + name);
    }

}
