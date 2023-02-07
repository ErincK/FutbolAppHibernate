package com.erinc.utility;


import com.erinc.repository.entity.Club;
import com.erinc.repository.entity.League;
import com.erinc.repository.entity.Player;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {
    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();



    private static SessionFactory sessionFactoryHibernate(){
        try{
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Player.class);
            configuration.addAnnotatedClass(League.class);
            configuration.addAnnotatedClass(Club.class);
            SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return factory;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }










}
