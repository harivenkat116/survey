package com.survey2015.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.service.SurveyeeInfoSurveysListService;

@Controller
public class ListSurveyeeInfoController {
	
	@Autowired
	private SurveyeeInfoSurveysListService service;

	@RequestMapping(value = "/listsurveyeeinfo", method=RequestMethod.GET)
	// @RequestMapping(value = "/listsurveyeeinfo", method=RequestMethod.POST)
	public ModelAndView allSurveyeeInfo() throws DAOException {
		List<SurveyeeInfo> surveyeeInfos = service.getAllSurveyeeInfos();

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list_surveyeeinfo");
		modelAndView.addObject("surveyeeInfos", surveyeeInfos);
		
		System.out.println("http://localhost:9090/Survey2015/listsurveyeeinfo");
		
		return modelAndView;
	}
}
