package com.horasan.cs_design_patterns.behavioral.strategy;

public interface ListStategy {
	default void start(StringBuilder sb) {};
	void addListItem(StringBuilder sb, String item);
	default void end(StringBuilder sb) {};
}
