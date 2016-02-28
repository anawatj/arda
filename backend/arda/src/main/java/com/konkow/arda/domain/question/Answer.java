package com.konkow.arda.domain.question;

import com.konkow.arda.domain.AbstractDomain;

public class Answer extends AbstractDomain<Integer>{

	
	public Answer()
	{
		
	}
	private Integer questionId;
	private String detail;
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
