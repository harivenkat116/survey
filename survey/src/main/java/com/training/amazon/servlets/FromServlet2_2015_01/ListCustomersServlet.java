package com.training.amazon.servlets.FromServlet2_2015_01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.amazon.dao.FromServlet2_2015_01.Customer;
import com.training.amazon.dao.FromServlet2_2015_01.CustomerService;
import com.training.amazon.dao.FromServlet2_2015_01.CustomerServiceImpl;
import com.training.amazon.dao.FromServlet2_2015_01.DAOException;

/**
 * Servlet implementation class ListCustomersServlet
 */
public class ListCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCustomersServlet() {
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
		CustomerService dao = new CustomerServiceImpl();
		try {
			List<Customer> customers = dao.getAllCustomers();

			request.setAttribute("customers", customers);	// place customers in output queue.
			request.setAttribute("size", customers.size());	// place customers.size() in output queue.
			
			// forward to JSP: Uncomment any one of the below lines and execute
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers1.jsp");
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers2.jsp");
			// RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list_customers3.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp_01/list_customers4.jsp");
			
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
