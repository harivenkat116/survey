package com.survey2015.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.SurveyeeInfoSurveysDAOJDBCImpl;
import com.survey2015.dao.Surveys;

/**
 * Servlet implementation class ListCustomersServlet
 */
public class UpdateFullSurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateFullSurveyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Integer> Array1 = new ArrayList<Integer>();
		
		
		int surveyeeId = 24;
		String surveyeeName = "Marlon Brando";
		int companyId = 4;
		String deskNumber = "122A";
		String phoneNumber = "7325452178";
		
/*
		int surveyeeId = 24;
		String surveyeeName = "Marlon Brando";
		int companyId = 5;
		String deskNumber = "322B";
		String phoneNumber = "4572165123";
*/

		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
		
		
		int surveyDetailsId = 0;
		// int surveyeeId = 24;       // Not required here
		String techCategory = "Laptop";
		String solvedOrNot = "Y";
		String solutionDegree = "5";
		String willToHelpRating = "4";
		String courtesyRating = "4";

/*		
		int surveyDetailsId = 0;
		// int surveyeeId = 24;       // Not required here
		String techCategory = "Desktop";
		String solvedOrNot = "N";
		String solutionDegree = "4";
		String willToHelpRating = "4";
		String courtesyRating = "4";
*/		
		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);


		SurveyeeInfoSurveysDAO dao = new SurveyeeInfoSurveysDAOJDBCImpl();

		try {
			Array1 = dao.updateFullSurvey(surveyeeInfo, surveys);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		System.out.println("surveyeeInfoRowsUpdated = " + Array1.get(0));
		System.out.println("surveysRowsUpdated = " + Array1.get(1));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
