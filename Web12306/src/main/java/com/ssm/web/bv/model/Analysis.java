package com.ssm.web.bv.model;

import java.util.Map;

public class Analysis {
	private Map<String, Temper> temper;
	private Map<String, Valence> valence;
	private Map<String, Arousal> arousal;
	private Map<String, Gender> gender;
	private Map<String, AudioQuality> audioQuality;
	private Map<String, Mood> mood;
	
	public Map<String, Temper> getTemper() {
		return temper;
	}
	public void setTemper(Map<String, Temper> temper) {
		this.temper = temper;
	}
	public Map<String, Valence> getValence() {
		return valence;
	}
	public void setValence(Map<String, Valence> valence) {
		this.valence = valence;
	}
	public Map<String, Arousal> getArousal() {
		return arousal;
	}
	public void setArousal(Map<String, Arousal> arousal) {
		this.arousal = arousal;
	}
	public Map<String, Gender> getGender() {
		return gender;
	}
	public void setGender(Map<String, Gender> gender) {
		this.gender = gender;
	}
	public Map<String, AudioQuality> getAudioQuality() {
		return audioQuality;
	}
	public void setAudioQuality(Map<String, AudioQuality> audioQuality) {
		this.audioQuality = audioQuality;
	}
	public Map<String, Mood> getMood() {
		return mood;
	}
	public void setMood(Map<String, Mood> mood) {
		this.mood = mood;
	}
	
}
