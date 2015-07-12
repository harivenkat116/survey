package com.survey2015.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.Surveys;
import com.survey2015.service.SurveyeeInfoSurveysUpdateService;

@Controller
public class UpdateFullSurveyController {

	@Autowired
	private SurveyeeInfoSurveysUpdateService service;

	@RequestMapping(value = "/updatefullsurvey", method = RequestMethod.GET)
	public String updateFullSurvey(@RequestParam("surveyeeId") int surveyeeId,
			@RequestParam("surveyeeName") String surveyeeName, @RequestParam("companyId") int companyId,
			@RequestParam("deskNumber") String deskNumber, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("surveyDetailsId") int surveyDetailsId, @RequestParam("techCategory") String techCategory,
			@RequestParam("solvedOrNot") String solvedOrNot, @RequestParam("solutionDegree") String solutionDegree,
			@RequestParam("willToHelpRating") String willToHelpRating, @RequestParam("courtesyRating") String courtesyRating)
			throws DAOException {
		
		List<Integer> Array1 = new ArrayList<Integer>();
		
		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
		
		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree,
				willToHelpRating, courtesyRating);

		try {
			Array1 = service.updateFullSurvey(surveyeeInfo, surveys);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/updatefullsurvey");
		
		System.out.println("surveyeeInfoRowsUpdated = " + Array1.get(0));
		System.out.println("surveysRowsUpdated = " + Array1.get(1));
		return "Success";
	}
}
