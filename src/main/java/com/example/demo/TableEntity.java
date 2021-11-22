package com.example.demo;

import org.springframework.context.annotation.EnableMBeanExport;

public class TableEntity {
    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public TableEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TableEntity setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public TableEntity setAge(int age) {
        this.age = age;
        return this;
    }
}
