package com.MedicineManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.dao.GetAllMedicineDao;
import com.MedicineManagement.entity.Medicines;

import java.util.List;

@Service
public class GetAllMedicineService {
    @Autowired
    GetAllMedicineDao getAllMedicineDao;
    public List<Medicines> getAllMedicines(){
        return getAllMedicineDao.getAllMedicines();
    }
}
