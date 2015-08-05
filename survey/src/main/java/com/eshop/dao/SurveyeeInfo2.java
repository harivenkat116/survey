package com.eshop.dao;

import java.util.List;

public class SurveyeeInfo2 {

	private int surveyeeId;
	private String surveyeeName;
	private int companyId;
	private String deskNumber;
	private String phoneNumber;

	private List<Surveys> surveys = null;
	
	public SurveyeeInfo2(int surveyeeId, String surveyeeName, int companyId,
			String deskNumber, String phoneNumber, List<Surveys> surveys) {
		super();
		this.surveyeeId = surveyeeId;
		this.surveyeeName = surveyeeName;
		this.companyId = companyId;
		this.deskNumber = deskNumber;
		this.phoneNumber = phoneNumber;
		this.surveys = surveys;
	}

	public int getSurveyeeId() {
		return surveyeeId;
	}

	public String getSurveyeeName() {
		return surveyeeName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getDeskNumber() {
		return deskNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public List<Surveys> getSurveys() {
		return surveys;
	}
	
	
	public void setSurveyeeId(int surveyeeId) {
		this.surveyeeId = surveyeeId;
	}

	public void setSurveyeeName(String surveyeeName) {
		this.surveyeeName = surveyeeName;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public void setDeskNumber(String deskNumber) {
		this.deskNumber = deskNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setSurveys(List<Surveys> surveys) {
		this.surveys = surveys;
	}
}
