package com.training.amazon.servlets.FromServlet2_2015_03;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.amazon.dao.FromServlet2_2015_03.DAOException;
import com.training.amazon.dao.FromServlet2_2015_03.SurveyeeInfo;
import com.training.amazon.dao.FromServlet2_2015_03.SurveyeeInfoDAO;
import com.training.amazon.dao.FromServlet2_2015_03.SurveyeeInfoDAOJDBCImpl;

/**
 * Servlet implementation class ListCustomersServlet
 */
public class ListSurveyeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSurveyeeInfoServlet() {
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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		SurveyeeInfoDAO dao = context.getBean(SurveyeeInfoDAO.class);
		//SurveyeeInfoDAO dao = new SurveyeeInfoDAOJDBCImpl();
		try {
			List<SurveyeeInfo> surveyeeInfos = dao.getAllSurveyeeInfos();

			request.setAttribute("surveyeeInfos", surveyeeInfos);	// place customers in output queue.
			request.setAttribute("size", surveyeeInfos.size());	// place customers.size() in output queue.
			
			// forward to JSP: Uncomment any one of the below lines and execute
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers1.jsp");
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers2.jsp");
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers3.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp_02/list_customers4.jsp");
			
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
