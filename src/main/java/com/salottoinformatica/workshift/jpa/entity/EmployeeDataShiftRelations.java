package com.salottoinformatica.workshift.jpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name="employeeDataShiftRelations")
public class EmployeeDataShiftRelations {
    @Id
    private Long id;


    @ManyToOne
    @MapsId("employeePersonalData")
    @JoinColumn(name = "employeePersonalData_id")
    public EmployeePersonalData employeePersonalData;

    //TODO: relazione a chiave composta
    /*
    @ManyToOne
    @MapsId("employeeShifts")
    @JoinColumns(@JoinColumn(name = "employeeShifts_id"))
    public EmployeeShifts employeeShifts;
    */
}
