/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.writer;

import java.io.FileWriter;
//FILE WRITER IS ALRE
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jorgedress.texteditor.main.fileActions.saveFile;

/**
 *
 * @author jorge
 */
public class FileWrite extends com.jorgedress.texteditor.main.fileActions.saveFile {
    
    public static void main(String[] args) {
        
        FileWriter file;
        try {
            file = new FileWriter(pathToSave);
            
            file.write(pathToSave);
            
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriter.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        
        
        
    }
    
}
