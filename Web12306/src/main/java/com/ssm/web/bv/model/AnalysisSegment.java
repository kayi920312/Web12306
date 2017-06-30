package com.ssm.web.bv.model;

import java.util.Map;

public class AnalysisSegment {
	
	private Integer offset;
	private Integer duration;
	private Map<String, Analysis> analysis;
	
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Map<String, Analysis> getAnalysis() {
		return analysis;
	}
	public void setAnalysis(Map<String, Analysis> analysis) {
		this.analysis = analysis;
	}
	
}
