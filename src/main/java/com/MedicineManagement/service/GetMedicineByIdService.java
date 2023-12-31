package com.MedicineManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.dao.GetMedicineDao;
import com.MedicineManagement.entity.Medicines;

@Service
public class GetMedicineByIdService {
    @Autowired
    GetMedicineDao getMedicineDao;
    public Medicines getMedicineById(Integer medicineId){
        return getMedicineDao.getMedicineById(medicineId);
    }
}
