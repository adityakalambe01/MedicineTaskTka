package com.MedicineManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.dao.AddMedicineDao;
import com.MedicineManagement.entity.Medicines;

@Service
public class AddMedicineService {
    @Autowired
    AddMedicineDao addMedicineDao;
    public boolean addMedicine(Medicines medicine){
        return addMedicineDao.addMedicineToDB(medicine);
    }
}
