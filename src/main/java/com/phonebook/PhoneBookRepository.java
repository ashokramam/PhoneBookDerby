package com.phonebook;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PhoneBookRepository extends CrudRepository<PhoneBookEntry,String> {
	
	List<PhoneBookEntry> findBySurName(String surName);
}
