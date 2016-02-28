package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.question.Question;

public interface IQuestionRepository extends Repository<Question,Integer>{
	public List<Question> finAll();
	public Question findByKey(Integer key);
	public void remove(Integer key);
	public Question stored(Question entity);
}
