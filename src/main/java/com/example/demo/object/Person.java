package com.example.demo.object;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String password;
    private String username;

    private String name;
    private String age;
    private String location;
    private String email;
    private String phoneNumber;
    private String sex;
    private String cccd;

    public Person() {
        super();
    }

    public Person(String name, String age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }


    public Person(String name, String age, String location, String email, String phoneNumber, String sex, String cccd) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.cccd = cccd;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getCccd() {
        return cccd;
    }
    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
}
