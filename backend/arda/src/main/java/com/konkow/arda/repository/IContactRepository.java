package com.konkow.arda.repository;

import java.util.List;

import com.konkow.arda.domain.contact.Contact;

public interface IContactRepository extends Repository<Contact,Integer> {

	public List<Contact> finAll();
	public Contact findByKey(Integer key);
	public void remove(Integer key);
	public Contact stored(Contact entity);
	
}
