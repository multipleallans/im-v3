package com.im.service;

import com.im.entity.WebConfig;

public interface WebConfigService {

	public WebConfig get() throws Exception;
	public WebConfig getOne() throws Exception;
	public void update(WebConfig wc) throws Exception;
	
}
