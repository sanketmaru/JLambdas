package main.java;

import java.util.List;
import java.util.stream.Collectors;

import static main.java.PersonPredicate.isAdultMale;

public class Persons {
	
	
	private List<Person> persons;
	
	List<Person> getAdultMales (){
		return persons.stream().filter(isAdultMale()).collect(Collectors.toList());
		
	}

}
