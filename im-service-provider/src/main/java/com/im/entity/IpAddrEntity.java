package com.im.entity;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="IpAddrEntity")
@SuppressWarnings("all")
@Data
public class IpAddrEntity extends BaseEntity{
    private String country;
    private String province;
}
