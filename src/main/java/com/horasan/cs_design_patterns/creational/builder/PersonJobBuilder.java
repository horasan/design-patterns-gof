package com.horasan.cs_design_patterns.creational.builder;

public class PersonJobBuilder extends PersonBuilder {
	
	public PersonJobBuilder(Person person) {
		this.person = person;
	}

	public PersonJobBuilder at(String companyName) {
		person.companyName = companyName;
		return this;
		
	}
	
	public PersonJobBuilder asA(String position) {
		person.position = position;
		return this;
		
	}
}
