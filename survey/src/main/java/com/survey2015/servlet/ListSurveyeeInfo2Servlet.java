package com.survey2015.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo2;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.SurveyeeInfoSurveysDAOJDBCImpl;
import com.survey2015.dao.Surveys;

/**
 * Servlet implementation class ListCustomersServlet
 */
public class ListSurveyeeInfo2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSurveyeeInfo2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
/*
 *  Note: below code is not using CustomerDAO, because that's not public
 *  
*/
		List<SurveyeeInfo2> surveyeeInfos2 = new ArrayList<SurveyeeInfo2>();
		List<Surveys> surveys = new ArrayList<Surveys>();
		
		// rec 1
		Surveys surveya = new Surveys(1, 1, "Laptop1", "Y", "5", "3", "3"); surveys.add(surveya);
		// Surveys surveyb = new Surveys(2, 1, "Desktop1", "N", "4", "2", "2"); surveys.add(surveyb);
		
		SurveyeeInfo2 SurveyeeInfo2a = new SurveyeeInfo2(1, "John", 24, "A21", "3456789123", surveys);
		surveyeeInfos2.add(SurveyeeInfo2a);
		
		// rec 2
		Surveys surveyc = new Surveys(10, 10, "Laptop10", "Y", "5", "3", "3"); surveys.add(surveyc);
		// Surveys surveyd = new Surveys(20, 10, "Desktop20", "N", "4", "2", "2"); surveys.add(surveyd);
		// Surveys surveye = new Surveys(30, 10, "Desktop30", "N", "4", "2", "2"); surveys.add(surveye);
		
		SurveyeeInfo2 SurveyeeInfo2b = new SurveyeeInfo2(10, "Sam2", 24, "A21", "3456789123", surveys);
		surveyeeInfos2.add(SurveyeeInfo2b);

		request.setAttribute("surveyeeInfos2", surveyeeInfos2);	// place customers in output queue.
		request.setAttribute("size", surveyeeInfos2.size());	// place customers.size() in output queue.
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp_02/list_surveyeeinfo2.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
