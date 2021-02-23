package com.horasan.cs_design_patterns.behavioral.strategy;

public class MarkdownListStrategy implements ListStategy {

	@Override
	public void addListItem(StringBuilder sb, String item) {
		// TODO Auto-generated method stub
		sb.append(" * ")
			.append(item)
			.append(System.lineSeparator());
	}

}
