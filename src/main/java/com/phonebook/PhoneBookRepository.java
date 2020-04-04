package com.phonebook;

import org.springframework.data.repository.CrudRepository;

public interface PhoneBookRepository extends CrudRepository<PhoneBookEntry,String> {
	
	PhoneBookEntry findBySurName(String surName);
}
