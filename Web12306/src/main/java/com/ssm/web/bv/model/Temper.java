package com.ssm.web.bv.model;

import java.util.Map;

public class Temper {
	
	private String Value;
	private String Group;
	private Map<String, Summary> summary;
	
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	public Map<String, Summary> getSummary() {
		return summary;
	}
	public void setSummary(Map<String, Summary> summary) {
		this.summary = summary;
	}
	
}
