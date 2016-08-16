/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import java.io.Serializable;
import java.util.TreeMap;

/**
 *
 * @author 985088
 */
public class UserStore implements Serializable {
    public UserStore(){
        
    }
    private static TreeMap<String, String> userMap = new TreeMap<>();
    static {
        userMap.put("admin","admin123");
        userMap.put("guest","guest123");
    }
    public TreeMap getUsers(){
        return userMap;
    }
    
}
