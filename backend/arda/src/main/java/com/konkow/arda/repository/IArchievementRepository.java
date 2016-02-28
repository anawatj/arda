package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.archievement.Archievement;

public interface IArchievementRepository extends Repository<Archievement,Integer>{

	
	public List<Archievement> finAll();
	public Archievement findByKey(Integer key);
	public void remove(Integer key);
	public Archievement stored(Archievement entity);
}
