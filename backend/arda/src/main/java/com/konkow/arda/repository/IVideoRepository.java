package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.video.Video;



public interface IVideoRepository extends Repository<Video,Integer> {
	
	
	
  public List<Video> finAll();
  public Video findByKey(Integer key);
  public void remove(Integer key);
  public Video stored(Video entity);
}
  
  
