package com.salottoinformatica.workshift.jpa.entity.entityid;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
public class EmployeeShiftID implements Serializable {
    private Timestamp startShift;
    private Timestamp endShift;

    public EmployeeShiftID() {
    }

    public EmployeeShiftID(Timestamp startShift, Timestamp endShift) {
        this.startShift = startShift;
        this.endShift = endShift;
    }
}