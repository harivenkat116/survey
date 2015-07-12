package com.survey2015.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.service.SurveyeeInfoSurveysUpdateService;

@Controller
public class UpdateSurveyeeInfoController {

	@Autowired
	private SurveyeeInfoSurveysUpdateService service;

	@RequestMapping(value = "/updatesurveyeeinfo", method = RequestMethod.GET)
	public String updateSurveyeeInfo(@RequestParam("surveyeeId") int surveyeeId,
			@RequestParam("surveyeeName") String surveyeeName, @RequestParam("companyId") int companyId,
			@RequestParam("deskNumber") String deskNumber, @RequestParam("phoneNumber") String phoneNumber)
			throws DAOException {
		
		int surveyeeInfoRowsUpdated = 0;
		
		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);

		try {
			surveyeeInfoRowsUpdated = service.updateSurveyeeInfo(surveyeeInfo);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/updatesurveyeeinfo" + "surveyeeInfoRowsUpdated = " + surveyeeInfoRowsUpdated);
		return "Success";
	}
}
