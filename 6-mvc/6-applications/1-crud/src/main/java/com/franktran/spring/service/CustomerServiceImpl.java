package com.franktran.spring.service;

import com.franktran.spring.dao.CustomerDao;
import com.franktran.spring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.insertCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public Customer deleteCustomer(Customer customer) {
        return customerDao.deleteCustomer(customer);
    }
}
