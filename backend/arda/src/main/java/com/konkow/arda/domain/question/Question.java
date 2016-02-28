package com.konkow.arda.domain.question;

import java.util.HashSet;
import java.util.Set;

import com.konkow.arda.domain.AbstractDomain;

public class Question extends AbstractDomain<Integer>{

	public Question()
	{
		this.answers =new HashSet<Answer>();
	}
	private String code;
	private String title;
	private String detail;
	private Set<Answer> answers;
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
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
