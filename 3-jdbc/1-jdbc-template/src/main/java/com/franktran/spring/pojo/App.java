package com.franktran.spring.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template-config.xml");
        Properties properties = context.getBean("properties", Properties.class);

        System.out.println(properties.getProperty("getAllCustomers"));

    }
}
