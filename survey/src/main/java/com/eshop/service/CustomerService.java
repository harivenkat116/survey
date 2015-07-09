package com.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.stereotype.Service;

import com.eshop.dao.Customer;
import com.eshop.dao.CustomerDAO;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	public List<Customer> getCustomers() {
		return dao.getAllCustomers();
	}
	
	public void add(Customer customer) {
		dao.createCustomer(customer);
	}
}
