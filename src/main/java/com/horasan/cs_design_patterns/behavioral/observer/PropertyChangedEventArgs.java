package com.horasan.cs_design_patterns.behavioral.observer;

public class PropertyChangedEventArgs<T> {
	
	public T source;
	public String propertyName;
	public Object newValue;
	public Object oldValue;
	
	public PropertyChangedEventArgs(T source, String propertyName, Object newValue, Object oldValue) {
		this.source = source;
		this.propertyName = propertyName;
		this.newValue = newValue;
		this.oldValue = oldValue;
	}
	
	

}
