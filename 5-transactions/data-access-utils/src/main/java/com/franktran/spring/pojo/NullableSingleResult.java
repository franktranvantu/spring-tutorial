package com.franktran.spring.pojo;

import com.franktran.spring.pojo.store.Customer;
import com.franktran.spring.pojo.store.CustomerRowMapper;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Properties;

public class NullableSingleResult {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = BeanUtils.getJdbcTemplate();
        Properties properties = BeanUtils.getProperties();

        int customerId = 1;

        CustomerRowMapper customerRowMapper = new CustomerRowMapper();
        List<Customer> customers = jdbcTemplate.query(properties.getProperty("getCustomerById"), customerRowMapper, customerId);
        Customer customer = DataAccessUtils.nullableSingleResult(customers);
        System.out.println(customer);
    }
}
