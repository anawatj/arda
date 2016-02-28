package com.konkow.arda.domain;

public abstract class AbstractDomain<K extends java.io.Serializable> implements IDomain<K> {

	
	
	private K id;

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}
}
