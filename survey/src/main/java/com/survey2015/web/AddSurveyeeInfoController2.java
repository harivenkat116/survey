package com.survey2015.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.service.SurveyeeInfoSurveysCreateService;

@Controller
public class AddSurveyeeInfoController2 {
	
	@Autowired
	private SurveyeeInfoSurveysCreateService service;

	@RequestMapping(value = "/addsurveyeeinfo2", method=RequestMethod.GET)
	public void addSurveyeeInfo() throws DAOException {
		
		int surveyeeId = 0;
		String surveyeeName = "Louis Armstrong";
		int companyId = 4;
		String deskNumber = "127C";
		String phoneNumber = "7322144456";
		
		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
		
		try {
			surveyeeId = service.createSurveyeeInfo(surveyeeInfo);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		System.out.println("http://localhost:9090/Survey2015/addsurveyeeinfo");
	}
}
