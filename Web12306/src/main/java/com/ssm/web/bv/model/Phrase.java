package com.ssm.web.bv.model;
/**
 * 短语Model
 * @author kaiying.chen
 */
public class Phrase {
	
	private Integer id;
	private Integer phraseId;
	private String phrase_group;
	private String language;
	private String phrase;
	private String chinese_translation;
	private String corrections;
	private String government_version;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPhraseId() {
		return phraseId;
	}
	public void setPhraseId(Integer phraseId) {
		this.phraseId = phraseId;
	}
	public String getPhrase_group() {
		return phrase_group;
	}
	public void setPhrase_group(String phrase_group) {
		this.phrase_group = phrase_group;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPhrase() {
		return phrase;
	}
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	public String getChinese_translation() {
		return chinese_translation;
	}
	public void setChinese_translation(String chinese_translation) {
		this.chinese_translation = chinese_translation;
	}
	public String getCorrections() {
		return corrections;
	}
	public void setCorrections(String corrections) {
		this.corrections = corrections;
	}
	public String getGovernment_version() {
		return government_version;
	}
	public void setGovernment_version(String government_version) {
		this.government_version = government_version;
	}
	
}
