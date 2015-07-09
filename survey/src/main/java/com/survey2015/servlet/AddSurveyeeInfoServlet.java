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

/**
 * Servlet implementation class ListCustomersServlet
 */
public class AddSurveyeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSurveyeeInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int surveyeeId = 0;
		String surveyeeName = "Marlon Brando";
		int companyId = 4;
		String deskNumber = "122A";
		String phoneNumber = "7325452178";

		SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);

		
		SurveyeeInfoSurveysDAO dao = new SurveyeeInfoSurveysDAOJDBCImpl();

		try {
			surveyeeId = dao.createSurveyeeInfo(surveyeeInfo);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		System.out.println("surveyeeId Inserted = " + surveyeeId);

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
