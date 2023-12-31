package com.MedicineManagement.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.entity.Medicines;

@Service
public class GetAllMedicineDao {
    @Autowired
    SessionFactory sessionFactory;
    public List<Medicines> getAllMedicines(){
        return sessionFactory.openSession()
                .createCriteria(Medicines.class)
                .list();
    }
    
}
