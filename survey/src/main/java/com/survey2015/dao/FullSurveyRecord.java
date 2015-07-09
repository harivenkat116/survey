package com.survey2015.dao;


public class FullSurveyRecord extends SurveyeeInfo {

	private int surveyDetailsId;
	private String techCategory;
	private String solvedOrNot;
	private String solutionDegree;
	private String willToHelpRating;
	private String courtesyRating;

	public FullSurveyRecord(int surveyeeId, String surveyeeName, int companyId,
			String deskNumber, String phoneNumber, int surveyDetailsId,
			String techCategory, String solvedOrNot, String solutionDegree,
			String willToHelpRating, String courtesyRating) {

		super(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
		
		this.surveyDetailsId = surveyDetailsId;
		this.techCategory = techCategory;
		this.solvedOrNot = solvedOrNot;
		this.solutionDegree = solutionDegree;
		this.willToHelpRating = willToHelpRating;
		this.courtesyRating = courtesyRating;
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
