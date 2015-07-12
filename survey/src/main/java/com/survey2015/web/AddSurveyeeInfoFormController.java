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
public class AddSurveyeeInfoFormController {

	@Autowired
	private SurveyeeInfoSurveysCreateService service;

	@RequestMapping(value = "/addsurveyeeinfo", method = RequestMethod.GET)
	public String addSurveyeeInfo(@RequestParam("surveyeeId") int surveyeeId,
			@RequestParam("surveyeeName") String surveyeeName, @RequestParam("companyId") int companyId,
			@RequestParam("deskNumber") String deskNumber, @RequestParam("phoneNumber") String phoneNumber)
			throws DAOException {
		
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
