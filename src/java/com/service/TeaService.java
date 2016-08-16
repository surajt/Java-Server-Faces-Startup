/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Tea;
import com.repository.TeaStore;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

/**
 *
 * @author 985088
 */
public class TeaService {

    public TeaService() {

    }
    @Inject
    private TeaStore teaStore;

    public String[] getColors() {
        return teaStore.getColors();
    }
    public Tea[] getTeaByType(String teaType) {
        if(teaType.equals("null") || teaType.isEmpty() || "".equals(teaType)) {
            return teaStore.getTeaByColor("white");
        }
        return teaStore.getTeaByColor(teaType);         
    }
    public String[] getMenus(){
        return teaStore.getMenu();
    }
}
