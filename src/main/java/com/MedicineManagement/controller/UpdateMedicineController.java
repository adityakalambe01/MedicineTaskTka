package com.MedicineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.entity.Medicines;
import com.MedicineManagement.service.UpdateMedicineService;

@RestController
public class UpdateMedicineController {
    @Autowired
    UpdateMedicineService service;
    @RequestMapping(value= "updateMedicine/{medicineId}", method = RequestMethod.PUT)
    public boolean updateMedicine(@PathVariable Integer medicineId, @RequestBody Medicines medicine){
        return service.updateMedicine(medicineId,medicine);
    }
}
