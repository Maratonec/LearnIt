/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codevio.learnit.main;

import com.codevio.learnit.json.Write;
import com.codevio.learnit.util.ObjectName;

/**
 *
 * @author Adamek
 */
public class LearnIt {
    
    private static ObjectName objectName;
    private static Write writer;

    public static void main(String[] args) {
        objectName = new ObjectName();
        
        String[] list = new String[5];
        list[0] = "#Melissa Fumero";
        list[1] = "#Brooklyn 99";
        list[2] = "#Andy Samberg";
        list[3] = "#Amy Santiago";
        list[4] = "#Jake Peralta";

        
writer = new Write(objectName.Type("Test", 1, false), list, "test.json");  
writer = new Write(objectName.Type("Test 2", 2, true), list, "test2.json");  
            
    }
    
}
