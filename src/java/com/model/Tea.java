/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author 985088
 */
public class Tea { 
    private String color;
    private String name;
    private String comments;
    private String picture;

    public Tea(String color, String name, String comments, String picture) {
        this.color = color;
        this.name = name;
        this.comments = comments;
        this.picture = picture;
    }

    public String getColor() {
        return color;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public String getComments() {
        return comments;
    }    
}