package com.survey2015.servlet;

import java.io.IOException;

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
public class AddSurveysServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSurveysServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int surveyDetailsId = 0;
		int surveyeeId = 24;
		String techCategory = "Laptop";
		String solvedOrNot = "Y";
		String solutionDegree = "5";
		String willToHelpRating = "4";
		String courtesyRating = "4";

		Surveys surveys = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);


		SurveyeeInfoSurveysDAO dao = new SurveyeeInfoSurveysDAOJDBCImpl();

		try {
			surveyDetailsId = dao.createSurveys(surveys);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		System.out.println("surveyDetailsId Inserted = " + surveyDetailsId);
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
