package com.training.amazon.dao.FromServlet2_2015_01;

import java.util.List;

/* public interface CustomerDAO {
 * Commented out original public interface and replaced with below non-public
 */
interface CustomerDAO {
	
	List<Customer> getAllCustomers() throws DAOException;
	Customer findByPrimaryKey(int id) throws DAOException;
	void createCustomer(Customer customer) throws DAOException;
	void updateCustomer(Customer customer) throws DAOException;
	void deleteCustomer(int customerId) throws DAOException;

}
