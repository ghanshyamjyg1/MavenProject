package com.shyam.dao;

import com.shyam.model.Customer;
import java.util.List;

public interface CustomerDAO {
    public void addCustomer(Customer customer);

    public List<Customer> getAllCustomers();

    public Customer updateCustomer(Customer customer);

}
