package com.geccocrawler.gecco.request;

import java.util.HashMap;
import java.util.Map;

public class HttpPostRequest extends AbstractHttpRequest {

	private Map<String, Object> fields;
	
	public HttpPostRequest(String url) {
		super(url);
		fields = new HashMap<String, Object>();
	}
	
	public Map<String, Object> getFields() {
		return fields;
	}

	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}

	public void addField(String name, String field) {
		fields.put(name, field);
	}
}
