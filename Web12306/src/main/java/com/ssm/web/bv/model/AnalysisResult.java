package com.ssm.web.bv.model;

import java.util.Map;

public class AnalysisResult {
	
	private Map<String, Summary> temper;
	private Map<String, Summary> valence;
	private Map<String, Summary> arousal;
	
	public Map<String, Summary> getTemper() {
		return temper;
	}
	public void setTemper(Map<String, Summary> temper) {
		this.temper = temper;
	}
	public Map<String, Summary> getValence() {
		return valence;
	}
	public void setValence(Map<String, Summary> valence) {
		this.valence = valence;
	}
	public Map<String, Summary> getArousal() {
		return arousal;
	}
	public void setArousal(Map<String, Summary> arousal) {
		this.arousal = arousal;
	}
	
	
}
