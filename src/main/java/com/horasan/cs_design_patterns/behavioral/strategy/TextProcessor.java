package com.horasan.cs_design_patterns.behavioral.strategy;

public class TextProcessor {
	private StringBuilder sb = new StringBuilder();
	private ListStategy ls;
	
	public TextProcessor(OutputFormat of) {
		setOutputFormat(of);
	}

	private void setOutputFormat(OutputFormat of) {
		switch(of) {
		case MARKDOWN:
			ls = new MarkdownListStrategy();
			break;
		case HTML:
			ls = new HtmlListStrategy();
			break;
		default:
			break;
		}
		
	}
	
	
}
