package com.horasan.cs_design_patterns.behavioral.strategy;

public class HtmlListStrategy implements ListStategy {

	@Override
	public void addListItem(StringBuilder sb, String item) {
		// TODO Auto-generated method stub
		sb.append("   <li>")
			.append(item)
			.append("</li>")
			.append(System.lineSeparator());
	}

	@Override
	public void start(StringBuilder sb) {
		sb.append("<ul>").append(System.lineSeparator());
		
	}

	@Override
	public void end(StringBuilder sb) {
		sb.append("</ul>").append(System.lineSeparator());
	}
	
	

}
