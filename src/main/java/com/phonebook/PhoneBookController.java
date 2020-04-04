package com.phonebook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * The Controller class for exposing the API Endpoints
 * @author Ashok Ramam
 *
 */
@RestController
public class PhoneBookController {
	
	@Autowired
	private PhoneBookRepository repository;
	
	@PostMapping("/storeEntries")
	public String storeEntries(@RequestBody List<PhoneBookEntry> phoneBookEntries){
		repository.saveAll(phoneBookEntries);
		return phoneBookEntries.size()+" Record(s) saved.";
	}
	
	@GetMapping("/listAll")
	public List<PhoneBookEntry> listAll(){
		return (List<PhoneBookEntry>) repository.findAll();
	}
	
	@PostMapping("/createEntry")
	public String createEntry(@RequestBody PhoneBookEntry phoneBookEntry) {
		repository.save(phoneBookEntry);
		return "Entry saved.";
	}
	
	@DeleteMapping("/removeEntry")
	public String removeEntry(@RequestBody PhoneBookEntry phoneBookEntry) {
		repository.delete(phoneBookEntry);
		return "Entry removed.";
	}
	
	@PutMapping("/updateEntry")
	public String updateEntry(@RequestBody PhoneBookEntry phoneBookEntry) {
		repository.save(phoneBookEntry);
		return "Entry updated.";
	}
}
