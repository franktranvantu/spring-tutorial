package com.franktran.spring.pojo;

import org.springframework.dao.support.DataAccessUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("1");
        System.out.println(DataAccessUtils.uniqueResult(list));
        System.out.println( "Hello World!" );
    }
}
