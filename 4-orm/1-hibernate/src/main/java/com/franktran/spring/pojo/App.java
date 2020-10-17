package com.franktran.spring.pojo;

import com.franktran.spring.orm.store.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.dao.support.DataAccessUtils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.getCurrentSession();

        session.getTransaction().begin();
        configuration.addAnnotatedClass(Customer.class);
        String sql = "SELECT customerId, firstName, lastName, birthDate, phone, address, city, state, points FROM Customer";
        Query<Object> query = session.createQuery(sql);
        List<Object> objects = query.getResultList();
        List<Customer> customers = objects.stream().map(o -> (Customer) o).collect(Collectors.toList());
        customers.forEach(System.out::println);
    }
}
