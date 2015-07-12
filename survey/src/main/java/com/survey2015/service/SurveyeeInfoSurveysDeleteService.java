package com.survey2015.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey2015.dao.FullSurveyRecord;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.Surveys;

@Service
public class SurveyeeInfoSurveysDeleteService {
	
	@Autowired
	private SurveyeeInfoSurveysDAO dao;

	public int deleteSurveyeeInfo(int surveyeeId, String surveyeeName) {
		return dao.deleteSurveyeeInfo(surveyeeId, surveyeeName);
	}
}
