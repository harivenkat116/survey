package com.training.amazon.dao.FromServlet2_2015_01;
/*
 *  Copied from CustomerDAO, with the purpose of creating the Service Layer of the MVC
 *  then commented out interfaces we don't need (see down below).
 *  Kept getAllCustomers() as mutable.
*/

import java.util.List;

public interface CustomerService {
	
	List<Customer> getAllCustomers() throws DAOException;

/* 
	Customer findByPrimaryKey(int id) throws DAOException;
	void createCustomer(Customer customer) throws DAOException;
	void updateCustomer(Customer customer) throws DAOException;
	void deleteCustomer(int customerId) throws DAOException;
*/

}
