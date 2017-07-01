package com.ssm.web.bv.model;

public class AnalysisResult {
	
	private Summary Temper;
	private Summary Valence;
	private Summary Arousal;
	
	public Summary getTemper() {
		return Temper;
	}
	public void setTemper(Summary temper) {
		Temper = temper;
	}
	public Summary getValence() {
		return Valence;
	}
	public void setValence(Summary valence) {
		Valence = valence;
	}
	public Summary getArousal() {
		return Arousal;
	}
	public void setArousal(Summary arousal) {
		Arousal = arousal;
	}
	
}
