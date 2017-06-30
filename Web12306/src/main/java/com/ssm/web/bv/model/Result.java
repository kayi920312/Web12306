package com.ssm.web.bv.model;

import java.util.List;

public class Result {
	
	private String duration;
	private String sessionStatus;
	private List<AnalysisSegment> analysisSegments;
	private AnalysisSummary analysisSummary;
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
	}
	public List<AnalysisSegment> getAnalysisSegments() {
		return analysisSegments;
	}
	public void setAnalysisSegments(List<AnalysisSegment> analysisSegments) {
		this.analysisSegments = analysisSegments;
	}
	public AnalysisSummary getAnalysisSummary() {
		return analysisSummary;
	}
	public void setAnalysisSummary(AnalysisSummary analysisSummary) {
		this.analysisSummary = analysisSummary;
	}
	
}
