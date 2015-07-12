package com.survey2015.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey2015.dao.FullSurveyRecord;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.Surveys;

@Service
public class SurveyeeInfoSurveysCreateService {
	
	@Autowired
	private SurveyeeInfoSurveysDAO dao;

	public int createSurveyeeInfo(SurveyeeInfo surveyeeInfo) {
		return dao.createSurveyeeInfo(surveyeeInfo);
	}
	
	public int createSurveys(Surveys surveys) {
		return dao.createSurveys(surveys);
	}
	
	public List<Integer> createFullSurvey(SurveyeeInfo surveyeeInfo, Surveys surveys) {
		return dao.createFullSurvey(surveyeeInfo, surveys);
	}
}
