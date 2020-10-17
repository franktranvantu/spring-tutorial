package com.franktran.spring.dao;

import com.franktran.spring.mapper.CustomerMapper;
import com.franktran.spring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    @Qualifier("sql")
    private Properties sql;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getAllCustomers() {
        return namedParameterJdbcTemplate.query(sql.getProperty("getAllCustomers"), customerMapper);
    }

    @Override
    public Customer getCustomerById(long id) {
        Map<String, Long> params = new HashMap<>();
        params.put("customerId", id);
        return namedParameterJdbcTemplate.queryForObject(sql.getProperty("getCustomerById"), params, customerMapper);
    }

    @Override
    public Customer insertCustomer(Customer customer) {
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource params = new MapSqlParameterSource()
        .addValue("firstName", customer.getFirstName())
        .addValue("lastName", customer.getLastName())
        .addValue("birthDate", customer.getBirthDate())
        .addValue("phone", customer.getPhone())
        .addValue("address", customer.getAddress())
        .addValue("city", customer.getCity())
        .addValue("state", customer.getState())
        .addValue("points", customer.getPoints());
        namedParameterJdbcTemplate.update(sql.getProperty("insertCustomer"), params, holder);
        customer.setCustomerId(holder.getKey().longValue());
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Map<String, Object> params = new HashMap<>();
        params.put("firstName", customer.getFirstName());
        params.put("lastName", customer.getLastName());
        params.put("birthDate", customer.getBirthDate());
        params.put("phone", customer.getPhone());
        params.put("address", customer.getAddress());
        params.put("city", customer.getCity());
        params.put("state", customer.getState());
        params.put("points", customer.getPoints());
        params.put("customerId", customer.getCustomerId());
        namedParameterJdbcTemplate.update(sql.getProperty("updateCustomer"), params);
        return customer;
    }

    @Override
    public Customer deleteCustomer(Customer customer) {
        Map<String, Long> params = new HashMap<>();
        params.put("customerId", customer.getCustomerId());
        namedParameterJdbcTemplate.update(sql.getProperty("deleteCustomer"), params);
        return customer;
    }
}
