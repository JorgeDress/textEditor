/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.fileActions;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jorge
 */
public class SaveFile {
    
    static JFileChooser folderChooser;

        
       public static String pathToSave; 
       public static String fileName;
       public static String fixedFileName;
       public static String fixedPath;

    
    public static void main(String[] args) {
        
        folderChooser = new JFileChooser();
        
        folderChooser.setDialogTitle("Save file...");
        
        FileFilter textFilter = new FileNameExtensionFilter("Simple text Files (*.txt)", "txt");
        
        folderChooser.setFileFilter(textFilter);
        
        int returnVal = folderChooser.showSaveDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        
            File selectedDir = folderChooser.getSelectedFile();
            
            String selDirString = selectedDir.toPath().toString();
            fileName = selectedDir.getName();
            
            pathToSave = selDirString;
            
            if (!fileName.toLowerCase().endsWith(".txt")) {
                fixedFileName = fileName.trim() +".txt";
            } else {
                fixedFileName = fileName;
            }
            if (!pathToSave.toLowerCase().endsWith(".txt")) {
                fixedPath = pathToSave + ".txt";
            } else {
                fixedPath=pathToSave;
            }
            
            System.out.println("Selected file name: "+fileName);
            
            System.out.println("Writing file "+selectedDir.getName());       
            
            
            System.out.println("To path "+selDirString);
            
            com.jorgedress.texteditor.main.writer.FileWrite.main(null);
            
            //com.jorgedress.texteditor.main.writer.FileWrite.main(null);
            
        }
        
    }
    
}
