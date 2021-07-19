package com.shyam.service;

import com.shyam.model.Customer;

import java.util.List;

public interface CustomerService {

    public void addCustomer(Customer customer);

    public List<Customer> getAllCustomers();

    public Customer updateCustomer(Customer customer);
}
