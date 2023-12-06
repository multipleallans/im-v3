package com.im.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="blacklist")
@SuppressWarnings("all")
public class Blacklist extends BaseEntity {


	private String mid;
	private String blacklist_ids;//多个用,分开
	
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	@Column(length=50000)
	public String getBlacklist_ids() {
		return blacklist_ids;
	}
	public void setBlacklist_ids(String blacklist_ids) {
		this.blacklist_ids = blacklist_ids;
	}
	
	
	  
}
