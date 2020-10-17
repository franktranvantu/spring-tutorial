package com.franktran.spring.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Properties;

public class BeanUtils {

    private static final ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("db-config.xml");

    public static JdbcTemplate getJdbcTemplate() {
        return APPLICATION_CONTEXT.getBean("jdbcTemplate", JdbcTemplate.class);
    }

    public static Properties getProperties() {
        return APPLICATION_CONTEXT.getBean("properties", Properties.class);
    }
}
