package com.codevio.learnit.json;

import com.codevio.learnit.util.ObjectName;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maratonec
 */
public class Write {
    
    private ArrayList type;
    private String[] content;
    private String path;
    Gson gson;

    
    
    public Write(ArrayList type, String content[], String path) {
        
        if(type != null) {
            
        this.type = type;
        this.content = content;
        this.path = path;
        
        gson = new Gson();
            try {
                write();
            } catch (IOException ex) {
                Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    
    public void write() throws IOException {
        
        Map<String, Object> map = new HashMap<>();
        for(int i = 0; i < content.length; i++) {
            String number = Integer.toString(i);
            map.put(number, content[i]);
        }
        Writer writer = new FileWriter("src/main/java/localfiles/" + path);
        gson.toJson(map, writer);
        writer.close();
    }
}
