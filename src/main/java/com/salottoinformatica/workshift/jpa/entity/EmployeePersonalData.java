package com.salottoinformatica.workshift.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeePersonalData")
public class EmployeePersonalData {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="age")
    private int age;

    @Column(name="task")
    private String task;

    @Column(name="seniority")
    private boolean seniority;

    @Column(name="isAssociate")
    private boolean isAssociate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isSeniority() {
        return seniority;
    }

    public void setSeniority(boolean seniority) {
        this.seniority = seniority;
    }

    public boolean isAssociate() {
        return isAssociate;
    }

    public void setAssociate(boolean associate) {
        isAssociate = associate;
    }

    @Override
    public String toString() {
        return "EmployeePersonalData{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", task=" + task +
                ", seniority=" + seniority +
                ", isAssociate=" + isAssociate +
                '}';
    }
}
