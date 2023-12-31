package com.MedicineManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.dao.DeleteMedicineDao;

@Service
public class DeleteMedicineByIdService {
    @Autowired
    DeleteMedicineDao deleteMedicineDao;
    public boolean deleteMedicineById(Integer medicineId){
        return deleteMedicineDao.deleteMedicineById(medicineId);
    }
}
