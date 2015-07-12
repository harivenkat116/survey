package com.survey2015.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.service.SurveyeeInfoSurveysListService;

@Controller
public class FindSurveyeeInfoByNameController {
	
	@Autowired
	private SurveyeeInfoSurveysListService service;

	@RequestMapping(value = "/findsurveyeeinfobyname", method=RequestMethod.GET)
	public ModelAndView surveyeeInfoByName(@RequestParam("surveyeeName") String surveyeeName) throws DAOException {
		List<SurveyeeInfo> surveyeeInfos = service.findSurveyeeInfoByName("%" + surveyeeName + "%");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list_surveyeeinfo");
		modelAndView.addObject("surveyeeInfos", surveyeeInfos);
		
		System.out.println("http://localhost:9090/Survey2015/findsurveyeeinfobyname");
		
		return modelAndView;
	}
}
