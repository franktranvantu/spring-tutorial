package com.franktran.spring.pojo;

import com.franktran.spring.pojo.store.Customer;
import com.franktran.spring.pojo.store.CustomerRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Properties;

public class Query {

    private static JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template-config.xml");
        jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        Properties properties = context.getBean("properties", Properties.class);

        List<Customer> customers;
        Customer customer;
        CustomerRowMapper customerRowMapper = new CustomerRowMapper();

        customers = query(properties.getProperty("getAllCustomers"), customerRowMapper);
        customers.forEach(System.out::println);

        customers = query(properties.getProperty("getCustomersByState"), customerRowMapper, "FL");
        customers.forEach(System.out::println);

        customer = queryForObject(properties.getProperty("getCustomerById"), customerRowMapper, 1);
        System.out.println(customer);

        customer = getCustomerById(properties.getProperty("getCustomerById"), customerRowMapper, 11);
        System.out.println(customer);
    }

    public static <T> List<T> query(String sql, RowMapper<T> rowMapper) throws DataAccessException {
        return jdbcTemplate.query(sql, rowMapper);
    }

    public static <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... args) throws DataAccessException {
        return jdbcTemplate.query(sql, rowMapper, args);
    }

    public static <T> T queryForObject(String sql, RowMapper<T> rowMapper, Object... args) throws DataAccessException {
        return jdbcTemplate.queryForObject(sql, rowMapper, args);
    }

    public static Customer getCustomerById(String sql, RowMapper<Customer> rowMapper, int id) throws DataAccessException {
        return DataAccessUtils.uniqueResult(jdbcTemplate.query(sql, rowMapper, id));
    }
}
