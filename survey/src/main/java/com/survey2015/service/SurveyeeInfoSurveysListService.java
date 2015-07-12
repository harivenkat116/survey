package com.survey2015.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey2015.dao.FullSurveyRecord;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.Surveys;

@Service
public class SurveyeeInfoSurveysListService {
	
	@Autowired
	private SurveyeeInfoSurveysDAO dao;

	public List<SurveyeeInfo> getAllSurveyeeInfos() {
		return dao.getAllSurveyeeInfos();
	}

	public List<SurveyeeInfo> findSurveyeeInfoByPrimaryKey(int surveyeeId) {
		return dao.findSurveyeeInfoByPrimaryKey(surveyeeId);
	}

	public List<SurveyeeInfo> findSurveyeeInfoByName(String surveyeeName) {
		return dao.findSurveyeeInfoByName(surveyeeName);
	}

	public List<Surveys> getAllSurveys() {
		return dao.getAllSurveys();
	}

	public List<Surveys> findSurveysBySurveyeeId(int surveyeeId) {
		return dao.findSurveysBySurveyeeId(surveyeeId);
	}
	
	public List<FullSurveyRecord> getAllFullSurvey() {
		return dao.getAllFullSurvey();
	}
}
