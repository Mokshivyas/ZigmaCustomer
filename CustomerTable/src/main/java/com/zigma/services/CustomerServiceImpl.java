package com.zigma.services;

import java.util.List;

import com.zigma.dao.CustomerDao;
import com.zigma.dao.CustomerDaoImpl;
import com.zigma.entities.Customer;

public class CustomerServiceImpl implements CustomerService 
{

		private CustomerDao customerDao;
		public CustomerServiceImpl() 
		{
			customerDao = new CustomerDaoImpl();
		}
	
	
	@Override
	public List<Customer> findAllCustomers() {
		return customerDao.getAll();
	}

	@Override
	public Customer findCustomerById(int CRN) {
		Customer customer= customerDao.getById(CRN);
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.insert(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.update(customer);

	}

	@Override
	public void removeCustomer(Customer customer) {
		customerDao.delete(customer);

	}

}
