package com.konkow.arda.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.konkow.arda.domain.news.News;
import com.konkow.arda.repository.INewsRepository;
@Repository
public class NewsRepository implements INewsRepository{

	public NewsRepository()
	{
		
	}
	public List<News> finAll() {
		// TODO Auto-generated method stub
		List<News> result = new ArrayList<News>();
		
		News item = new News();
		item.setCode("01");
		item.setId(1);
		item.setTitle("∑¥ Õ∫");
		item.setDetail("∑¥ Õ∫ ∑¥ Õ∫");
		result.add(item);
		item = new News();
		item.setCode("02");
		item.setId(1);
		item.setTitle("∑¥ Õ∫2");
		item.setDetail("∑¥ Õ∫2  ∑¥ Õ∫2");
		result.add(item);
		
		return result;
		
		
		
		
		
		
	}

	public News findByKey(Integer key) {
		if(key==1)
		{
			News item = new News();
			item.setCode("01");
			item.setId(1);
			item.setTitle("∑¥ Õ∫");
			item.setDetail("∑¥ Õ∫ ∑¥ Õ∫");
			return item;
		}else
		{
			News item = new News();
			item.setCode("02");
			item.setId(2);
			item.setTitle("∑¥ Õ∫2");
			item.setDetail("∑¥ Õ∫2  ∑¥ Õ∫2");
			return item;
		}
	}

	public void remove(Integer key) {
		// TODO Auto-generated method stub
		
	}

	public News stored(News entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
