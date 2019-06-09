package com.auge.base.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author machunlin
 * @date 2019/6/6
 */
public class UserDto implements Serializable {
    @JsonProperty("name")
    @NotNull
    @Size(min = 6, max = 50)
    private String name;

    private Integer age;

    public UserDto() {
    }

    @NotNull
    public String getName() {
        return name;
    }

    public UserDto setName(@NotNull String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserDto setAge(Integer age) {
        this.age = age;
        return this;
    }
}
