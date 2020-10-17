package com.franktran.spring.pojo;

import com.franktran.spring.pojo.store.CustomerRowMapper;
import com.franktran.spring.pojo.store.Customer;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Properties;

public class SingleResult {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = BeanUtils.getJdbcTemplate();
        Properties properties = BeanUtils.getProperties();

        int customerId = 1; // 0

        CustomerRowMapper customerRowMapper = new CustomerRowMapper();
        List<Customer> customers = jdbcTemplate.query(properties.getProperty("getCustomerByState"), customerRowMapper, customerId);
        Customer customer = DataAccessUtils.singleResult(customers);
        System.out.println(customer);
    }
}
