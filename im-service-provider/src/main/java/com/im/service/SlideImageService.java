package com.im.service;

import com.im.bean.Pager;
import com.im.entity.SlideImage;

public interface SlideImageService {

	public abstract Pager findByPager(String[] properties, Object[] vals, Pager Pager ) throws Exception;
	public abstract void delete(SlideImage si) throws Exception;
	public abstract void update(SlideImage si) throws Exception;
	public abstract void save(SlideImage si) throws Exception;
	public abstract SlideImage get(String id) throws Exception;
    
}
