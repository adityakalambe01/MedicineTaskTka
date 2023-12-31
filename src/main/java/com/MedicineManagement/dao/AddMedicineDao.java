package com.MedicineManagement.dao;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.entity.Medicines;

@Repository
public class AddMedicineDao {
    @Autowired
    SessionFactory sessionFactory;
    public boolean addMedicineToDB(Medicines medicine){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(medicine);
        tx.commit();
        return true;
    }
}
