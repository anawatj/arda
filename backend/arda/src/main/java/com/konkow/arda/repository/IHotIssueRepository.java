package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.hotissue.HotIssue;

public interface IHotIssueRepository extends Repository<HotIssue,Integer> {

	public List<HotIssue> finAll();
	public HotIssue findByKey(Integer key);
	public void remove(Integer key);
	public HotIssue stored(HotIssue entity);
	
}
