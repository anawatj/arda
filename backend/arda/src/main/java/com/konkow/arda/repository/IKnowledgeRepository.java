package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.knowledge.Knowledge;

public interface IKnowledgeRepository extends Repository<Knowledge,Integer> {

	public List<Knowledge> finAll();
	public Knowledge findByKey(Integer key);
	public void remove(Integer key);
	public Knowledge stored(Knowledge entity);
}
