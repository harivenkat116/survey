package com.eshop.dao;

//TODO rename to Surveyee
public class SurveyeeInfo {

	private int surveyeeId;
	private String surveyeeName;
	private int companyId;
	private String deskNumber;
	private String phoneNumber;

	
	public SurveyeeInfo(int surveyeeId, String surveyeeName, int companyId,
			String deskNumber, String phoneNumber) {
		super();
		this.surveyeeId = surveyeeId;
		this.surveyeeName = surveyeeName;
		this.companyId = companyId;
		this.deskNumber = deskNumber;
		this.phoneNumber = phoneNumber;
	}
	
	public SurveyeeInfo() {
		super();
		// TODO Auto-generated constructor stub
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
}
