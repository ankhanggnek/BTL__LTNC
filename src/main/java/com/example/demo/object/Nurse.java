package com.example.demo.object;

import org.springframework.stereotype.Component;

@Component
public class Nurse extends Person {

    private String qualifications;
    private String expertise;
    private String title;
    private int floor;
    private int room;
    private String time_off;

    public Nurse() {
        super();
    }

    public Nurse(String name, String age, String location, String email, String phoneNumber, String sex, String cccd, String qualifications, String expertise, String title, int floor, int room,String time_off) {
        super(name, age, location, email, phoneNumber, sex, cccd);
        this.qualifications = qualifications;
        this.expertise = expertise;
        this.title = title;
        this.floor = floor;
        this.room = room;
        this.time_off = time_off;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String department) {
        this.expertise = department;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int isFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int isRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getTime_off() {
        return time_off;
    }

    public void setTime_off(String time_off) {
        this.time_off = time_off;
    }
}
