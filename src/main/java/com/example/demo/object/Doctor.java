package com.example.demo.object;

import org.springframework.stereotype.Component;

@Component
public class Doctor extends Person {

    private String id;
    private String department;
    private String qualifications;
    private boolean available;
    private String time_off;

    public Doctor() {
        super();
    }

    public Doctor(String name, String age, String location, String email, String phoneNumber, String sex, String cccd, String id, String department, String qualifications, boolean available, String time_off) {
        super(name, age, location, email, phoneNumber, sex, cccd);
        this.id = id;
        this.department = department;
        this.qualifications = qualifications;
        this.available = available;
        this.time_off = time_off;
    }

    public String getId(){
        return id;
    }

    public String setId(){
        this.id = id;
    }    
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTime_off() {
        return time_off;
    }

    public void setTime_off(String time_off) {
        this.time_off = time_off;
    }
}

