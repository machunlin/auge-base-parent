package com.auge.base.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author machunlin
 * @date 2019/6/9
 */
public class BaseModel implements Serializable {
    @TableId(
            value = "id",
            type = IdType.AUTO
    )
    protected Long id;

    public Long getId() {
        return id;
    }

    public BaseModel setId(Long id) {
        this.id = id;
        return this;
    }
}
