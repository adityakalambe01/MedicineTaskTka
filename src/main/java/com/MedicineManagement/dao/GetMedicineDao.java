package com.MedicineManagement.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.entity.Medicines;

@Repository
public class GetMedicineDao {
    @Autowired
    SessionFactory sessionFactory;
    public Medicines getMedicineById(Integer medicineId){
        return sessionFactory.openSession()
               .get(Medicines.class, medicineId);
    }
}
