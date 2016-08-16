/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.repository.UserStore;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author 985088
 */
public class UserAuthentication implements Serializable {
   @Inject
   private UserStore userStore;
   
   public UserAuthentication(){
       
   }
   
   public boolean authenticate(String username, String password) {
       if(userStore.getUsers().containsKey(username)) {
           if(userStore.getUsers().get(username).equals(password)) {
               return true;
           }
       }
       return false;
   }
    
}
