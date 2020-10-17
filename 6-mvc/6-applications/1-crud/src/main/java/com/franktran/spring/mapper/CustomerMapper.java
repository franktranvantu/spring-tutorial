package com.franktran.spring.mapper;

import com.franktran.spring.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        long customerId = rs.getInt("customer_id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        LocalDate birthDate = rs.getDate("birth_date").toLocalDate();
        String phone = rs.getString("phone");
        String address = rs.getString("address");
        String city = rs.getString("city");
        String state = rs.getString("state");
        int points = rs.getInt("points");
        return new Customer(customerId, firstName, lastName, birthDate, phone, address, city, state, points);
    }
}
