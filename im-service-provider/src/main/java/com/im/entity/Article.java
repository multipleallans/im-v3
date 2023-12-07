package com.im.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="article")
@SuppressWarnings("all")
public class Article extends BaseEntity {

	private String title;
	private String content;
	private Integer status=0;//0显示 1不显示
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(length=10000)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStatus() {
		if(null==status) return 0;
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	  
	  
}
