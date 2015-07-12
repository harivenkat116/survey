package com.survey2015.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey2015.dao.FullSurveyRecord;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.Surveys;

@Service
public class SurveyeeInfoSurveysUpdateService {
	
	@Autowired
	private SurveyeeInfoSurveysDAO dao;

	public int updateSurveyeeInfo(SurveyeeInfo surveyeeInfo) {
		return dao.updateSurveyeeInfo(surveyeeInfo);
	}

	public int updateSurveys(Surveys surveys) {
		return dao.updateSurveys(surveys);
	}
	
	public List<Integer> updateFullSurvey(SurveyeeInfo surveyeeInfo, Surveys surveys) {
		return dao.updateFullSurvey(surveyeeInfo, surveys);
	}
}
