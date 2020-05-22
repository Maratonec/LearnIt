/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codevio.learnit.util;

import java.util.ArrayList;

/**
 *
 * @author Maratonec
 */
public class ObjectName {
    
    
    
    public ArrayList Type (String type, int length, boolean enabled) {
       
        ArrayList value = new ArrayList();
        value.add(type);
        value.add(length);
        
         if (!enabled) {
            return null;
        } else {
            return value;
        }
        
    }
    
}
