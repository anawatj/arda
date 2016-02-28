package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.product.Product;

public interface IProductRepository extends Repository<Product,Integer> {

	
	public List<Product> finAll();
	public Product findByKey(Integer key);
	
	public void remove(Integer key);
	public Product stored(Product entity);
}
