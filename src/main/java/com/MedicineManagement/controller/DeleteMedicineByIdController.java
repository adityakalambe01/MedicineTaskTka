package com.MedicineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.service.DeleteMedicineByIdService;

@RestController
public class DeleteMedicineByIdController {
    @Autowired
    DeleteMedicineByIdService service;
    @RequestMapping(value = "/deleteMedicine/{id}", method = RequestMethod.DELETE)
    public boolean deleteMedicineById(@PathVariable Integer id){
        return service.deleteMedicineById(id);
    }
}
