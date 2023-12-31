package com.MedicineManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.dao.UpdateMedicineDao;
import com.MedicineManagement.entity.Medicines;

@Repository
public class UpdateMedicineService {
    @Autowired
    UpdateMedicineDao updateMedicineDao;
    public boolean updateMedicine(Integer medicineId, Medicines medicine){
        return updateMedicineDao.updateMedicine(medicineId, medicine);
    }
}
