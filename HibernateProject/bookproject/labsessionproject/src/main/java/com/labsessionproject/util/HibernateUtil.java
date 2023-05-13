package com.labsessionproject.util;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.labsessionproject.model.Book;


public class HibernateUtil {

	private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) 
        {
            try 
            {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/kalai?useSSL=false");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "kalaiadi10");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");             
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                
                //create,create-drop,update
                settings.put(Environment.HBM2DDL_AUTO, "create");
                configuration.setProperties(settings);	                
                configuration.addAnnotatedClass(Book.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
	
}

