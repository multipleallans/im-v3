package com.im.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name="yy_ip_list")
@SuppressWarnings("all")
@Data
public class IpListEntity implements Serializable {


    private static final long serialVersionUID = 1359226263358730102L;

//    @ApiModelProperty(value = "")
    @Id
    private Long id;

//    @ApiModelProperty(value = "IP地址")
    private String ip_address;

//    @ApiModelProperty(value = "备注")
    private String note;

//    @ApiModelProperty(value = "IP名单类型：0->ipweb白名单；1->ip黑名单")
    private String type;

//    @ApiModelProperty(value = "状态：0-正常；1-删除")
    private String stauts;

}
