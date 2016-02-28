package com.konkow.arda.domain.news;

import com.konkow.arda.domain.AbstractDomain;

public class News extends AbstractDomain<Integer>{

	
	public News()
	{
		
	}
	private String code;
	private String title;
	private String detail;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
