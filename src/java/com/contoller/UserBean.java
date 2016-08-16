/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contoller;

import com.model.User;
import com.service.UserAuthentication;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.*;
import javax.inject.Inject;

/**
 *
 * @author 985088
 */
@Named
@SessionScoped
public class UserBean implements Serializable {

    @Inject
    private UserAuthentication userAuth;
    
    private User user;
    private boolean loggedIn;
    public UserBean() {
        this.user = new User();
    }

    public User getUser() {
        return user;
    }

    public String doLogin() {
        if (userAuth.authenticate(user.getUsername(), user.getPassword())) {
            loggedIn=true;
            return "welcome?facet-force=true";
        } else {
            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("message", "Invalid Username or Password");
            return "login";
        }
    }

    public String doLogOut() {
        loggedIn=false;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login";
    }

    public void checkLogin(ComponentSystemEvent event) {
        if (!loggedIn) {
            FacesContext context = FacesContext.getCurrentInstance();
            ConfigurableNavigationHandler handler
                    = (ConfigurableNavigationHandler) context.getApplication().getNavigationHandler();
            handler.performNavigation("login");
        }
    }
}
