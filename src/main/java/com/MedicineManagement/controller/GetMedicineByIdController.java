package com.MedicineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.entity.Medicines;
import com.MedicineManagement.service.GetMedicineByIdService;

@RestController
public class GetMedicineByIdController {
    @Autowired
    GetMedicineByIdService getMedicineByIdService;
    @RequestMapping(value = "/getMedicineById/{id}", method = RequestMethod.GET)
    public Medicines getMedicinesById(@PathVariable Integer medicineId){
        return getMedicineByIdService.getMedicineById(medicineId);
    }
}
