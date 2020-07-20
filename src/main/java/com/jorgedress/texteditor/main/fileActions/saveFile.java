/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.fileActions;

import java.io.File;
import javax.swing.*;

/**
 *
 * @author jorge
 */
public class saveFile {
    
    static JFileChooser folderChooser;

        
       public static String pathToSave; 

    
    public static void main(String[] args) {
        
        folderChooser = new JFileChooser();
        //folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        folderChooser.setDialogTitle("Save file...");
        
        int returnVal = folderChooser.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        
            File selectedDir = folderChooser.getSelectedFile();
            
            String selDirString = selectedDir.toPath().toString();
            
            System.out.println(selDirString);       
            
            pathToSave = selDirString;
        }
        
    }
    
}
