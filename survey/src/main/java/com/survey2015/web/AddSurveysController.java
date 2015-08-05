package com.survey2015.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.Surveys;
import com.survey2015.service.SurveyeeInfoSurveysCreateService;

@Controller
public class AddSurveysController {

	@Autowired
	private SurveyeeInfoSurveysCreateService service;
	

	/*
	 * Either activate commented code, or use the active uncommented code that right after commented block.
	 * 
	 * @RequestMapping(value = "/addsurveys", method=RequestMethod.GET)
	 * public String addSurveys() throws DAOException {
	 * 
	 * int surveyDetailsId = 0;
	 * int surveyeeId = 81;
	 * String techCategory = "Desktop";
	 * String solvedOrNot = "Y";
	 * String solutionDegree = "5";
	 * String willToHelpRating = "4";
	 * String courtesyRating = "4";
	 */
	
	@RequestMapping(value = "/addsurveys", method = RequestMethod.GET)
	public String addSurveys(@RequestParam("surveyeeId") int surveyeeId, @RequestParam("techCategory") String techCategory,
			@RequestParam("solvedOrNot") String solvedOrNot, @RequestParam("solutionDegree") String solutionDegree,
			@RequestParam("willToHelpRating") String willToHelpRating, @RequestParam("courtesyRating") String courtesyRating)
			throws DAOException {

		int surveyDetailsId = 0;
		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);

		try {
			surveyDetailsId = service.createSurveys(surveys);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/addsurveys");
		return "Success";
	}
}
