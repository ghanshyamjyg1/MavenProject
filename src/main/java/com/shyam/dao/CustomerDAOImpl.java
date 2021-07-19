package com.shyam.dao;


import com.shyam.model.Customer;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl<unchecked> implements CustomerDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }


    @SuppressWarnings("unchecked")
    public List<Customer> getAllCustomers() {
        return sessionFactory.getCurrentSession().createQuery("from Customer")
                .list();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        sessionFactory.getCurrentSession().update(customer);
        return customer;
    }


}
