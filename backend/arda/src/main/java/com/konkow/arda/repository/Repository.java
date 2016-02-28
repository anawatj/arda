package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.IDomain;

public interface Repository <E extends IDomain<K>,K extends java.io.Serializable>{

			
	public List<E> finAll();
	public E findByKey(K key);
	public E stored(E entity);
	public void remove(K key);
	
	
}
