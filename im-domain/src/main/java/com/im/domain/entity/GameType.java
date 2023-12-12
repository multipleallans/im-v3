package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameType {
    jielong((byte) 0),
    niuniu((byte)1),
    saolei((byte)2),
    jinqiang((byte)3),
    sangong((byte)4),
    g28((byte)5);

    @EnumValue
    private final int code;
}
