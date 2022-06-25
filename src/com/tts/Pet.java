package com.tts;

public class Pet {
	
//	Constant Variables
	
	static final Integer MINIMUM_AGE = 0;
	
//	Instance Variables
	
	private String name;
	private Integer age;
	private String location;
	private String type;
	
	
//	Getters and Setters
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}	
	public String getType() {
		return type;
	}
	
	
//	Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		if(age < 0) {
			this.age = MINIMUM_AGE;
		} else {
			this.age = age;
		}
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
//	Constructors
	
	public Pet() {
		this.name = "Test name";
		setAge(MINIMUM_AGE);
		this.location = "City, State";
		this.type = "Pet";
	}
	
	public Pet(String name, Integer age, String location, String type) {
		this.name = name;
		setAge(MINIMUM_AGE);
		this.location= location;
		this.type = type;
	}
	
}

//1. Create a Pet Class with the following instance variables: 
//
//name (PRIVATE) 
//age (PRIVATE) 
//location (PRIVATE) 
//type (PRIVATE) 
//two constructors(empty, all attributes)
//Code to be able to access the following (Get Methods): 
//name, age, type 
//Code to be able to change (Set Methods): 
//name, age, location 

