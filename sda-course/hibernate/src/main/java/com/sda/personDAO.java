package com.sda;

import com.sda.utilities.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class personDAO {

    public void createPerson(Person person){
        Transaction transaction = null;
        try {
            Session session = HibernateConfiguration.getSessionFactory().openSession();
            // start transaction
            transaction = session.beginTransaction();
            // save the person object
            session.save(person);
            // commit transcaction
            transaction.commit();
        } catch (Exception ex){
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }

    }
}
