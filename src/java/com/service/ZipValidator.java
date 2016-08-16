/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author suraj
 */
@FacesValidator("ZipValidator")
public class ZipValidator implements Validator  {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        UIInput stateUi = (UIInput) component.findComponent("state");
        String state = stateUi.getLocalValue() == null ? "": stateUi.getLocalValue().toString();
        
        if(state.equals("IA")) {
            if(value.toString().startsWith("5")) {
                
            } else {
                FacesMessage msg = new FacesMessage("State IA should start with 5", "State IA should start with 5");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
            }
        }
    }
    
}
