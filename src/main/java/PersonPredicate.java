package main.java;

import java.util.function.Predicate;

import main.java.Person.Gender;

public class PersonPredicate {
	
	public static Predicate<Person> isAdultMale(){
		return p -> p.getAge() > 60 && p.getGender() == Gender.MALE;		
	}

}
