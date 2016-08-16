/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contoller;

import com.model.Tea;
import com.service.TeaService;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author 985088
 */
@Named(value = "teaBean")
@RequestScoped
public class TeaBean {
    @Inject 
    private TeaService teaService;
    
    public TeaBean() {
    }
    public String[] getColors(){
        return teaService.getColors();
    }
    public TeaService getTeaService(){
        return teaService;
    }
    private String selectedColor; 

    public String getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }
    private String selectedTea;

    public String getSelectedTea() {
        return selectedTea;
    }

    public void setSelectedTea(String selectedTea) {
        this.selectedTea = selectedTea;
    }
    
    public Tea[] getTeaByType(){
        if(selectedColor==null) {
            selectedColor=getColors()[0];
        }
        return teaService.getTeaByType(selectedColor);
    }
    
}
