package com.zigma.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zigma.entities.Customer;

public class CustomerDaoImpl implements CustomerDao 
{
	private Session session;
	public CustomerDaoImpl() 
	{
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session= f.openSession();
	}
	
	
	@Override
	public List<Customer> getAll() {
		return session.createQuery("from Customer").getResultList();
	}

	@Override
	public Customer getById(int CRN) {
		return session.get(Customer.class, CRN);
	}

	@Override
	public void insert(Customer customer) {
		Transaction t = session.beginTransaction();
		session.save(customer);
		t.commit();

	}

	@Override
	public void update(Customer customer) {
		Transaction t = session.beginTransaction();
		session.update(customer);
		t.commit();


	}

	@Override
	public void delete(Customer customer) {
		Transaction t = session.beginTransaction();
		session.delete(customer);
		t.commit();


	}

}
