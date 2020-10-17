package com.franktran.spring.pojo;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Properties;

public class LongResult {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = BeanUtils.getJdbcTemplate();
        Properties properties = BeanUtils.getProperties();

        String state = "CA";

        List<Integer> ids = jdbcTemplate.queryForList(properties.getProperty("getCustomerIdByState"), Integer.class, state);
        long id = DataAccessUtils.longResult(ids);
        System.out.println(id);
    }
}
