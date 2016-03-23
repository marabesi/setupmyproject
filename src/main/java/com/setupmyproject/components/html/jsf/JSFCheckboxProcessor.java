package com.setupmyproject.components.html.jsf;

import com.setupmyproject.components.html.CheckBoxHtmlElement;
import com.setupmyproject.components.html.ViewElement;

public class JSFCheckboxProcessor extends JSFBasePartProcessor {

	@Override
	public boolean supports(ViewElement viewElement) {
		return viewElement.getClass().equals(CheckBoxHtmlElement.class);
	}

	@Override
	public String processOpen(ViewElement viewElement) {
		return "<input type='text' jsf:id='" + inputIdPath(viewElement)
				+ "' value='#{"+inputValuePath(viewElement)+"}'/>\n";
	}
	
	@Override
	public String processClose(ViewElement viewElement) {
		return "<h:message for='"+inputIdPath(viewElement)+"'/>\n";
	}

}
