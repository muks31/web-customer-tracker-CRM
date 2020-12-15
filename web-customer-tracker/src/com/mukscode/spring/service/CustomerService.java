package com.mukscode.spring.service;

import java.util.List;

import com.mukscode.spring.entity.Customer;

public interface CustomerService {
	
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);

}
