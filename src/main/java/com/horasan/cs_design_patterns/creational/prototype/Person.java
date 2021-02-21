package com.horasan.cs_design_patterns.creational.prototype;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.lang3.SerializationUtils;

public class Person implements Serializable {
	
	public String[] names;
	public Address address;
	
	public Person(String[] names, Address address) {
		super();
		this.address = address;
		this.names = names;
	}
	
	@Override
	public String toString() {
		return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
	}

	// Implement copy constructor instead of Clonable interface.
	public Person(Person otherPerson) {
		this(otherPerson.names.clone(), new Address(otherPerson.address.streetName, otherPerson.address.houseNumber));
	}
	
	public Person deepCopyBySerialization(Person otherPerson) {
		Person newPerson = SerializationUtils.roundtrip(otherPerson);
		return newPerson;
	}
	
}
