package com.survey2015.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.service.SurveyeeInfoSurveysCreateService;

@Controller
public class AddSurveyeeInfoController {

	@Autowired
	private SurveyeeInfoSurveysCreateService service;

	/*
	 * Either activate commented code, or use the active uncommented code that right after commented block.
	 * 
	 * @RequestMapping(value = "/addsurveyeeinfo", method=RequestMethod.GET)
	 * public String addSurveyeeInfo() throws DAOException {
	 * 
	 * int surveyeeId = 0;
	 * String surveyeeName = "Louis Armstrong";
	 * int companyId = 4;
	 * String deskNumber = "127C";
	 * String phoneNumber = "7322144456";
	 */

	@RequestMapping(value = "/addsurveyeeinfo", method = RequestMethod.GET)
	public String addSurveyeeInfo(@RequestParam("surveyeeName") String surveyeeName,
			@RequestParam("companyId") int companyId, @RequestParam("deskNumber") String deskNumber,
			@RequestParam("phoneNumber") String phoneNumber)
			throws DAOException {
		
		int surveyeeId = 0;
		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);

		try {
			surveyeeId = service.createSurveyeeInfo(surveyeeInfo);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/addsurveyeeinfo");
		return "Success";
	}
}
