package com.konkow.arda.domain.archievement;

import com.konkow.arda.domain.AbstractDomain;

public class Archievement extends AbstractDomain<Integer> {
		
	public Archievement()
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
