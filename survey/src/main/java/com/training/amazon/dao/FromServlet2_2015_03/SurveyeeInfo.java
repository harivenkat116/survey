package com.training.amazon.dao.FromServlet2_2015_03;

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
}
