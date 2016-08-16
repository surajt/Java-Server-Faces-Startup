/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contoller;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author suraj
 */
@Named(value = "promotion")
@RequestScoped
public class Promotion {
    private String name; 
    private String email;
    private Date dateOfBirht; 
    private String address; 
    private String state; 
    private int zip; 
    private byte age; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirht() {
        return dateOfBirht;
    }

    public void setDateOfBirht(Date dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    
   public String doSubmit(){
       return "thankyou";
   }
    
}
