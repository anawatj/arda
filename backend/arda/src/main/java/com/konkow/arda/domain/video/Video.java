package com.konkow.arda.domain.video;

import com.konkow.arda.domain.AbstractDomain;

public class Video extends AbstractDomain<Integer>{

	
	public Video()
	{
		
	}
	private String code;
	private String name;
	private String path;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
