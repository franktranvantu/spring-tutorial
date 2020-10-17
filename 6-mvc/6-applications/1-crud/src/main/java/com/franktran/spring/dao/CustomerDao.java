package com.franktran.spring.dao;

import com.franktran.spring.model.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();

    Customer getCustomerById(long id);

    Customer insertCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);
}
