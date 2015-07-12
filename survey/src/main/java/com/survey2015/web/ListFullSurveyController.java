package com.survey2015.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.FullSurveyRecord;
import com.survey2015.service.SurveyeeInfoSurveysListService;

@Controller
public class ListFullSurveyController {
	
	@Autowired
	private SurveyeeInfoSurveysListService service;

	@RequestMapping(value = "/listfullsurvey", method=RequestMethod.GET)
	public ModelAndView allFullSurvey() throws DAOException {
		List<FullSurveyRecord> fullSurveyRecords = service.getAllFullSurvey();

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list_fullsurvey");
		modelAndView.addObject("fullSurveyRecords", fullSurveyRecords);
		
		System.out.println("http://localhost:9090/Survey2015/listfullsurvey");
		
		return modelAndView;
	}
}
