package com.eshop.dao;

//TODO Change this to Survey
public class Surveys {
	
	//TODO Survey has Surveyee
	private int surveyDetailsId;
	
	//private Surveyee surveyee;
	
	private int surveyeeId;
	private String techCategory;
	private String solvedOrNot;
	private String solutionDegree;
	private String willToHelpRating;
	private String courtesyRating;
	
	public Surveys(int surveyDetailsId, int surveyeeId, String techCategory, String solvedOrNot, String solutionDegree,
			String willToHelpRating, String courtesyRating) {
		super();
		this.surveyDetailsId = surveyDetailsId;
		this.surveyeeId = surveyeeId;
		this.techCategory = techCategory;
		this.solvedOrNot = solvedOrNot;
		this.solutionDegree = solutionDegree;
		this.willToHelpRating = willToHelpRating;
		this.courtesyRating = courtesyRating;
	}

	public Surveys() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSurveyDetailsId() {
		return surveyDetailsId;
	}

	public int getSurveyeeId() {
		return surveyeeId;
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

	public void setSurveyeeId(int surveyeeId) {
		this.surveyeeId = surveyeeId;
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
