package com.franktran.spring.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("named-parameter-jdbc-template-config.xml");
        NamedParameterJdbcTemplate jdbcTemplate = context.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);

        String sql = "SELECT first_name " +
                "FROM customers";
        Map<String, String> params = new HashMap<>();
        List<String> firstNames = jdbcTemplate.queryForList(sql, params, String.class);
        System.out.println(firstNames);
    }
}
