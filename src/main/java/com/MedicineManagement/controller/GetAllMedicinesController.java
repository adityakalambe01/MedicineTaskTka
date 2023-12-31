package com.MedicineManagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.entity.Medicines;
import com.MedicineManagement.service.GetAllMedicineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;


@RestController
public class GetAllMedicinesController {
    @Autowired
    GetAllMedicineService getAllMedicineService;
    @RequestMapping(value = "getAllMedicine", method=RequestMethod.GET)
    public List<Medicines> getAllMedicine() {
        return getAllMedicineService.getAllMedicines();
    }
    
}
