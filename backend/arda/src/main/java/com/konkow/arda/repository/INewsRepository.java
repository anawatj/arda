package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.news.News;

public interface INewsRepository extends Repository<News,Integer> {

	
	public List<News> finAll();
	
	public News findByKey(Integer key);
	
	public void remove(Integer key);
	public News stored(News entity);
	
}
