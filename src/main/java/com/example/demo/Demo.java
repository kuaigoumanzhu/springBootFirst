package com.example.demo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 实体类
 */
public class Demo {
    private int id;
    private String name;
    @JSONField(format="yyyy-MM-dd: HH:mm")
    private Date createTime;
    @JSONField(serialize = false)
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
