package com.auge.base.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author machunlin
 * @date 2019/6/6
 */
public class UserDto implements Serializable {
    @JsonProperty("name")
//    @NotNull
//    @Size(min = 6, max = 50)
    private String name;
    private int age;

    public UserDto() {
    }

    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserDto setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
