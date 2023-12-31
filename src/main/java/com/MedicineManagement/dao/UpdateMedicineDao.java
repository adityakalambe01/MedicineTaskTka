package com.MedicineManagement.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.entity.Medicines;

@Repository
public class UpdateMedicineDao {
    @Autowired
    SessionFactory sessionFactory;
    public boolean updateMedicine(Integer medicineId, Medicines medicine){
        Session session = sessionFactory.openSession();
        try{
            Medicines m = session.load(Medicines.class, medicineId);
            m.setMedicineName(medicine.getMedicineName());
            m.setMedicineDescription(medicine.getMedicineDescription());
            Transaction tx = session.beginTransaction();
            session.update(m);
            tx.commit();
            session.close();
        }catch(Exception e){
            return false;
        }

        return true;
    }
}
