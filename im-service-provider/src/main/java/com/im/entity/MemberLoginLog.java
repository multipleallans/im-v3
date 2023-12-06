package com.im.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="memberloginlog")
@SuppressWarnings("all")
@Data
public class MemberLoginLog extends BaseEntity {

	private String mid;
	private String mtel;
	private String mnickName;
	private String ip;
	private String ipAddr;
	
}
