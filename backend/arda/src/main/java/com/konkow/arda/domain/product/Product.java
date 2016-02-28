package com.konkow.arda.domain.product;

import com.konkow.arda.domain.AbstractDomain;

public class Product extends AbstractDomain<Integer>{

	
	public Product()
	{
		
	}
	private String code;
	private String name;
	private String detail;
	private String picture;
	private String pdf;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPdf() {
		return pdf;
	}
	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	
}
