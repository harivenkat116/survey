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
import com.survey2015.dao.FullSurveyRecord;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.SurveyeeInfoSurveysDAOJDBCImpl;
import com.survey2015.dao.Surveys;
import com.survey2015.service.SurveyeeInfoSurveysCreateService;

@Controller
public class AddFullSurveyViaFormController {

	@Autowired
	private SurveyeeInfoSurveysCreateService service;

		@RequestMapping(value = "/addfullsurveyform", method = RequestMethod.GET)
		public ModelAndView createFullEmptySurvey() throws DAOException {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("AddFullSurvey");
				// Mechanics of below line: Creates an empty object (the model) and names it as "fullSurveyRecord".
				// modelAndView.addObject("fullSurveyRecord", new FullSurveyRecord());
				// But we'll follow below technoque.
			FullSurveyRecord fullSurveyRecord = new FullSurveyRecord();
				// fullSurveyRecord.setSurveyeeName("Please enter full name");
			modelAndView.addObject("fullSurveyRecord", fullSurveyRecord);
			
			System.out.println("http://localhost:9090/Survey2015/addfullsurveyform - GET");
			return modelAndView;
		}
		
		@RequestMapping(value = "/addfullsurveyform", method = RequestMethod.POST)
		public String saveFullSurveyRecord(FullSurveyRecord fullSurveyRecord) {

			List<Integer> Array1 = new ArrayList<Integer>();
			
			System.out.println("fullSurveyRecord.getSurveyeeName() = " + fullSurveyRecord.getSurveyeeName());
/*			
			int surveyeeId = 0;
			SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, fullSurveyRecord.getSurveyeeName(),
					                   fullSurveyRecord.getCompanyId(), fullSurveyRecord.getDeskNumber(),
					                   fullSurveyRecord.getPhoneNumber());

			int surveyDetailsId = 0;
			Surveys surveys = new Surveys(surveyDetailsId, surveyeeId,
					fullSurveyRecord.getTechCategory(), fullSurveyRecord.getSolvedOrNot(),
					fullSurveyRecord.getSolutionDegree(), fullSurveyRecord.getWillToHelpRating(),
					fullSurveyRecord.getCourtesyRating());

			try {
				Array1 = service.createFullSurvey(surveyeeInfo, surveys);
			} catch (DAOException e) {
				e.printStackTrace();
			}

*/			System.out.println("http://localhost:9090/Survey2015/addfullsurveyform - POST");
			return "Success";
		}
}
