package com.MedicineManagement.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.entity.Medicines;

@Repository
public class DeleteMedicineDao {
    @Autowired
    SessionFactory sessionFactory;
    public boolean deleteMedicineById(Integer medicineId){
        try(Session session = sessionFactory.openSession()){
            Medicines m = session.load(Medicines.class, medicineId);
            Transaction tx = session.beginTransaction();
            session.delete(m);
            tx.commit();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
}
