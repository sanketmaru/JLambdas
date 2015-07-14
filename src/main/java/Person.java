package main.java;

import java.util.function.Predicate;

public class Person {
	
	private int age;
	public enum Gender {MALE, FEMALE}
	
	private Gender gender;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	};
	
	

}


