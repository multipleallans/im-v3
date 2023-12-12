package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ControlModel {
    s1(0);
    @EnumValue
    private final int code;
}
