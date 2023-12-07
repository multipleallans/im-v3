//package com.im.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JpaConfig {
//
//    @Autowired
//    private EntityManagerFactory entityManagerFactory;
//
//    public Session getSession() {
//        return entityManagerFactory.unwrap(SessionFactory.class).openSession();
//    }
//
//}
