package com.tkhn0625.rest.webservices.restfulwebservices;

public class HelloWorldBeans {
    private String name;

    public HelloWorldBeans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldBeans{" +
                "name='" + name + '\'' +
                '}';
    }
}
