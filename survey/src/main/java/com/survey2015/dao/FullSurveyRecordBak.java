package com.survey2015.dao;

public class FullSurveyRecordBak {

	private int surveyeeId;
	private String surveyeeName;
	private int companyId;
	private String deskNumber;
	private String phoneNumber;

	private int surveyDetailsId;
	private String techCategory;
	private String solvedOrNot;
	private String solutionDegree;
	private String willToHelpRating;
	private String courtesyRating;

	public FullSurveyRecordBak(int surveyeeId, String surveyeeName, int companyId,
			String deskNumber, String phoneNumber, int surveyDetailsId,
			String techCategory, String solvedOrNot, String solutionDegree,
			String willToHelpRating, String courtesyRating) {
		super();
		this.surveyeeId = surveyeeId;
		this.surveyeeName = surveyeeName;
		this.companyId = companyId;
		this.deskNumber = deskNumber;
		this.phoneNumber = phoneNumber;
		this.surveyDetailsId = surveyDetailsId;
		this.techCategory = techCategory;
		this.solvedOrNot = solvedOrNot;
		this.solutionDegree = solutionDegree;
		this.willToHelpRating = willToHelpRating;
		this.courtesyRating = courtesyRating;
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

	public int getSurveyDetailsId() {
		return surveyDetailsId;
	}

	public String getTechCategory() {
		return techCategory;
	}

	public String getSolvedOrNot() {
		return solvedOrNot;
	}

	public String getSolutionDegree() {
		return solutionDegree;
	}

	public String getWillToHelpRating() {
		return willToHelpRating;
	}

	public String getCourtesyRating() {
		return courtesyRating;
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
	
	public void setSurveyDetailsId(int surveyDetailsId) {
		this.surveyDetailsId = surveyDetailsId;
	}

	public void setTechCategory(String techCategory) {
		this.techCategory = techCategory;
	}

	public void setSolvedOrNot(String solvedOrNot) {
		this.solvedOrNot = solvedOrNot;
	}

	public void setSolutionDegree(String solutionDegree) {
		this.solutionDegree = solutionDegree;
	}

	public void setWillToHelpRating(String willToHelpRating) {
		this.willToHelpRating = willToHelpRating;
	}

	public void setCourtesyRating(String courtesyRating) {
		this.courtesyRating = courtesyRating;
	}

}
