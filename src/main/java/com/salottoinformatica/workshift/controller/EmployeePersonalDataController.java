package com.salottoinformatica.workshift.controller;

import com.salottoinformatica.workshift.jpa.entity.EmployeePersonalData;
import com.salottoinformatica.workshift.jpa.service.EmployeePersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeePersonalDataController {
    private final EmployeePersonalDataService employeePersonalDataService;

    public EmployeePersonalDataController(EmployeePersonalDataService employeePersonalDataService) {
        this.employeePersonalDataService = employeePersonalDataService;
    }

    @RequestMapping("/employee")
    public List<EmployeePersonalData> getAllEmployeePersonalData(){
        return employeePersonalDataService.getAllEmployeePersonalDataService();
    }

    @RequestMapping("/employeePersonalData/{id}")
    public EmployeePersonalData getEmployeePersonalData(@PathVariable String id) {
        return employeePersonalDataService.getEmployeePersonalData(id);
    }
}
