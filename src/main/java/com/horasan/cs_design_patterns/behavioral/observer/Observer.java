package com.horasan.cs_design_patterns.behavioral.observer;

public interface Observer<T> {
	void handle(PropertyChangedEventArgs<T> args);
}
