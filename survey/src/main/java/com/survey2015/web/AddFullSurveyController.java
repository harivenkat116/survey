package com.survey2015.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.SurveyeeInfoSurveysDAOJDBCImpl;
import com.survey2015.dao.Surveys;
import com.survey2015.service.SurveyeeInfoSurveysCreateService;

@Controller
public class AddFullSurveyController {

	@Autowired
	private SurveyeeInfoSurveysCreateService service;

/*	
	@RequestMapping(value = "/addfullsurvey", method = RequestMethod.GET)
	public String addSurveyeeInfo()	throws DAOException {

		List<Integer> Array1 = new ArrayList<Integer>();
		
		int surveyeeId = 0;
		String surveyeeName = "Bill Maher";
		int companyId = 3;
		String deskNumber = "22B";
		String phoneNumber = "2122165123";
		
		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);


		int surveyDetailsId = 0;
		// int surveyeeId = 24;       // Not required here
		String techCategory = "Network";
		String solvedOrNot = "N";
		String solutionDegree = "4";
		String willToHelpRating = "3";
		String courtesyRating = "4";
		
		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);
*/		

		@RequestMapping(value = "/addfullsurvey", method = RequestMethod.GET)		
		public String addSurveyeeInfo(@RequestParam("surveyeeId") int surveyeeId,
				@RequestParam("surveyeeName") String surveyeeName, @RequestParam("companyId") int companyId,
				@RequestParam("deskNumber") String deskNumber, @RequestParam("phoneNumber") String phoneNumber,
				@RequestParam("surveyDetailsId") int surveyDetailsId, @RequestParam("techCategory") String techCategory,
				@RequestParam("solvedOrNot") String solvedOrNot, @RequestParam("solutionDegree") String solutionDegree,
				@RequestParam("willToHelpRating") String willToHelpRating, @RequestParam("courtesyRating") String courtesyRating)
				throws DAOException {

		List<Integer> Array1 = new ArrayList<Integer>();
		
		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);

		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);

		try {
			Array1 = service.createFullSurvey(surveyeeInfo, surveys);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		System.out.println("http://localhost:9090/Survey2015/addfullsurvey");
		return "Success";
	}
}
