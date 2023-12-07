package com.im.entity;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Table(name = "homepage_user")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@ApiModel
@Entity
public class HomepageUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //@ApiModelProperty(value = "")
    @Id
    private Integer id;

    //@ApiModelProperty(value = "mid")
    private Integer member_id;

    //@ApiModelProperty(value = "outLinkId")
    private String out_link_id;

    //@ApiModelProperty(value = "开关状态")
    private Integer status;

}
