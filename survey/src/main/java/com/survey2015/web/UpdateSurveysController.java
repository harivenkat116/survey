package com.survey2015.web;

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
public class UpdateSurveysController {

	@Autowired
	private SurveyeeInfoSurveysUpdateService service;

	@RequestMapping(value = "/updatesurveys", method = RequestMethod.GET)
	public String updateSurveys(@RequestParam("surveyDetailsId") int surveyDetailsId,
			@RequestParam("surveyeeId") int surveyeeId, @RequestParam("techCategory") String techCategory,
			@RequestParam("solvedOrNot") String solvedOrNot, @RequestParam("solutionDegree") String solutionDegree,
			@RequestParam("willToHelpRating") String willToHelpRating, @RequestParam("courtesyRating") String courtesyRating)
			throws DAOException {
		
		int surveysRowsUpdated = 0;
		
		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree,
				willToHelpRating, courtesyRating);

		try {
			surveysRowsUpdated = service.updateSurveys(surveys);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/updatesurveys" + "surveysRowsUpdated = " + surveysRowsUpdated);
		return "Success";
	}
}
