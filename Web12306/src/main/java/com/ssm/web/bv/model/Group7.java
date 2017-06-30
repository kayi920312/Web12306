package com.ssm.web.bv.model;

import java.util.Map;

public class Group7 {
	
	private Map<String, Primary> primaryMap;
	private Map<String, Secondary> secondaryMap;
	
	public Map<String, Primary> getPrimaryMap() {
		return primaryMap;
	}
	public void setPrimaryMap(Map<String, Primary> primaryMap) {
		this.primaryMap = primaryMap;
	}
	public Map<String, Secondary> getSecondaryMap() {
		return secondaryMap;
	}
	public void setSecondaryMap(Map<String, Secondary> secondaryMap) {
		this.secondaryMap = secondaryMap;
	}
	
}
