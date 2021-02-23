package com.horasan.cs_design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
	private List<Observer<T>> observers = new ArrayList<>();
	
	public void subscribe(Observer<T> observer) {
		observers.add(observer);
	}
	
	protected void notify(T source, String propertyName, Object newValue, Object oldValue) {
		for (Observer<T> o : observers) {
			o.handle(new PropertyChangedEventArgs<T>(source, propertyName, newValue, oldValue));
		}
	} 
}
