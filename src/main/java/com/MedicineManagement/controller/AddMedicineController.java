package com.MedicineManagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.entity.Medicines;
import com.MedicineManagement.service.AddMedicineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class AddMedicineController {
    @Autowired
    AddMedicineService service;
    @RequestMapping(value = "/addMedicine", method=RequestMethod.POST)
    public boolean addMedicine(@RequestBody Medicines medicines) {
        return service.addMedicine(medicines);
    }
    
}
