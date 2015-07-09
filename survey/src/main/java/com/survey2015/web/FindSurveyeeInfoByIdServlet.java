package com.survey2015.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.service.SurveyeeInfoSurveysService;

@Controller
public class FindSurveyeeInfoByIdServlet {
	
	@Autowired
	private SurveyeeInfoSurveysService service;

	@RequestMapping(value = "/listsurveyeeinfo2", method=RequestMethod.GET)
	public ModelAndView surveyeeInfo() throws DAOException {
		List<SurveyeeInfo> surveyeeInfos = service.getAllSurveyeeInfos();

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list_surveyeeinfo");
		modelAndView.addObject("surveyeeInfos", surveyeeInfos);
		
		System.out.println("http://localhost:9090/Survey2015/listsurveyeeinfo");
		
		return modelAndView;
	}
}
