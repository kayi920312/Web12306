package com.ssm.web.bv.model;

import java.util.Map;

public class Mood {
	
	private Map<String, Composite> composite;
	private Map<String, Group11> group11;
	private Map<String, Group21> group21;
	private Map<String, Group7> group7;
	
	public Map<String, Composite> getComposite() {
		return composite;
	}
	public void setComposite(Map<String, Composite> composite) {
		this.composite = composite;
	}
	public Map<String, Group11> getGroup11() {
		return group11;
	}
	public void setGroup11(Map<String, Group11> group11) {
		this.group11 = group11;
	}
	public Map<String, Group21> getGroup21() {
		return group21;
	}
	public void setGroup21(Map<String, Group21> group21) {
		this.group21 = group21;
	}
	public Map<String, Group7> getGroup7() {
		return group7;
	}
	public void setGroup7(Map<String, Group7> group7) {
		this.group7 = group7;
	}
	
	
}
