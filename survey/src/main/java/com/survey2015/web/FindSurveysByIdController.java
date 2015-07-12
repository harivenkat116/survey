package com.survey2015.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.Surveys;
import com.survey2015.service.SurveyeeInfoSurveysListService;

@Controller
public class FindSurveysByIdController {
	
	@Autowired
	private SurveyeeInfoSurveysListService service;

	@RequestMapping(value = "/findsurveysbyid", method=RequestMethod.GET)
	public ModelAndView surveyeeInfoByPrimaryKey(@RequestParam("surveyeeId") int surveyeeId) throws DAOException {
		List<Surveys> surveys = service.findSurveysBySurveyeeId(surveyeeId);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list_surveys");
		modelAndView.addObject("surveys", surveys);
		
		System.out.println("http://localhost:9090/Survey2015/findsurveysbyid");
		
		return modelAndView;
	}
}
