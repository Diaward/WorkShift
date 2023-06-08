package com.salottoinformatica.workshift.jpa.entity;

import com.salottoinformatica.workshift.jpa.entity.entityid.EmployeeShiftID;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="employeeShifts")
public class EmployeeShifts {

	@EmbeddedId
	private EmployeeShiftID employeeShiftID;

    @Column(name="duration")
    private int duration;
    
    @Column(name="isHoliday")
    private boolean isHoliday;
    
    @Column(name="isWeekend")
    private boolean isWeekend;

	/*
    @ManyToMany(mappedBy = "employeeShifts")
    Set<EmployeePersonalData> employeePersonalData;
	*/

    public EmployeeShifts() {

    }

	public EmployeeShifts(EmployeeShiftID employeeShiftID, int duration, boolean isHoliday, boolean isWeekend, Set<EmployeePersonalData> employeePersonalData) {
		this.employeeShiftID = employeeShiftID;
		this.duration = duration;
		this.isHoliday = isHoliday;
		this.isWeekend = isWeekend;
		//this.employeePersonalData = employeePersonalData;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isHoliday() {
		return isHoliday;
	}

	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}

	public boolean isWeekend() {
		return isWeekend;
	}

	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}


}
