package com.shyam.service;

import com.shyam.dao.CustomerDAO;
import com.shyam.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    @Override
    @Transactional
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        // TODO Auto-generated method stub
        return customerDAO.updateCustomer(customer);
    }
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
