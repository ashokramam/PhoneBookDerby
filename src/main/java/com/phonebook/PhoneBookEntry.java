package com.phonebook;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="phonebook_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneBookEntry {

	@Id
	private int id;
	private String phoneNumber;
	private String surName;
	private String firstName;
	private String[] address;
}
