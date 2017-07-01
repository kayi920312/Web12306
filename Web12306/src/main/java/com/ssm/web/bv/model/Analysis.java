package com.ssm.web.bv.model;

public class Analysis {
	
	private Temper Temper;
	private Valence Valence;
	private Arousal Arousal;
	private Gender Gender;
	private AudioQuality AudioQuality;
	private Mood Mood;
	
	public Temper getTemper() {
		return Temper;
	}
	public void setTemper(Temper temper) {
		Temper = temper;
	}
	public Valence getValence() {
		return Valence;
	}
	public void setValence(Valence valence) {
		Valence = valence;
	}
	public Arousal getArousal() {
		return Arousal;
	}
	public void setArousal(Arousal arousal) {
		Arousal = arousal;
	}
	public Gender getGender() {
		return Gender;
	}
	public void setGender(Gender gender) {
		Gender = gender;
	}
	public AudioQuality getAudioQuality() {
		return AudioQuality;
	}
	public void setAudioQuality(AudioQuality audioQuality) {
		AudioQuality = audioQuality;
	}
	public Mood getMood() {
		return Mood;
	}
	public void setMood(Mood mood) {
		Mood = mood;
	}
	
}
