package com.dergax_and_jareq.game.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        
        if (sessionFactory == null || sessionFactory.isClosed()) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        
        return sessionFactory;
    }

}
