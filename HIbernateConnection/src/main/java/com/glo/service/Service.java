package com.glo.service;

import com.glo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {

        public static void main(String[] args)
        {

     Configuration config= new Configuration().configure();
     SessionFactory session=config.buildSessionFactory();
    Employee emp=new Employee();
     //emp.setId(101);
     emp.setName("Rajiv kumar");

     Session sess =session.openSession();
     Transaction t=  sess.beginTransaction();
     sess.save(emp);

     t.commit();

     }
}
