package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum MemberType {

    USER((byte) 0, "用户"),
    ROBOT((byte) 1, "机器人"),
    AGENT((byte) 2, "代理商");

    @EnumValue
    @JsonValue
    private final byte code;
    private final String description;

    MemberType(byte code, String description)
    {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static MemberType of(byte code)
    {
        for (MemberType t : values())
        {
            if (t.code == code)
            {
                return t;
            }
        }
        return null;
    }

    public byte code()
    {
        return code;
    }

    public String description()
    {
        return description;
    }
}
