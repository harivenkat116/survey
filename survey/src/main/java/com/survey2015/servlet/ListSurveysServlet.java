package com.survey2015.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;
import com.survey2015.dao.SurveyeeInfoSurveysDAOJDBCImpl;
import com.survey2015.dao.Surveys;

/**
 * Servlet implementation class ListCustomersServlet
 */
public class ListSurveysServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSurveysServlet() {
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
*/
		SurveyeeInfoSurveysDAO dao = new SurveyeeInfoSurveysDAOJDBCImpl();
		try {
			List<Surveys> surveys = dao.getAllSurveys();

			request.setAttribute("surveys", surveys);	// place customers in output queue.
			request.setAttribute("size", surveys.size());	// place customers.size() in output queue.
			
			// forward to JSP: Uncomment any one of the below lines and execute
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers1.jsp");
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers2.jsp");
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers3.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp_02/list_surveys.jsp");
			
			dispatcher.forward(request, response);
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
