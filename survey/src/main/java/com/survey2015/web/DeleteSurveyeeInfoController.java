package com.survey2015.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.survey2015.dao.DAOException;
import com.survey2015.service.SurveyeeInfoSurveysDeleteService;

@Controller
public class DeleteSurveyeeInfoController {

	@Autowired
	private SurveyeeInfoSurveysDeleteService service;

	@RequestMapping(value = "/deletesurveyeeinfo", method = RequestMethod.GET)
	public String deleteSurveyeeInfo(@RequestParam("surveyeeId") int surveyeeId,
			@RequestParam("surveyeeName") String surveyeeName) throws DAOException {
		
		int surveyeeInfoRowsDeleted = 0;

		try {
			surveyeeInfoRowsDeleted = service.deleteSurveyeeInfo(surveyeeId, surveyeeName);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/deletesurveyeeinfo" + "surveyeeInfoRowsDeleted = " + surveyeeInfoRowsDeleted);
		return "Success";
	}
}
