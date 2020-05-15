/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.patientcare.patient.submodels;

import java.io.Serializable;

/**
 *
 * @author lilith
 */
public enum Language implements Serializable{
    
        armenian("armenian","armenian"), 
        russian("russian", "russian"), 
        english("english","english");
        
        
        private final String key;
        private final String value;

    private Language(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
        
}
