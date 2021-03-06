/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.writerAndReader;

import java.io.FileWriter;
//FILE WRITER IS ALRE
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jorgedress.texteditor.main.fileActions.SaveFile;
import static com.jorgedress.texteditor.main.MainFrame.mainTabPane;
import com.jorgedress.texteditor.main.fileActions.SaveFile;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;

/**
 *
 * @author jorge
 */
public class FileWrite extends com.jorgedress.texteditor.main.fileActions.SaveFile {
    
    public static boolean fileSaved;
    
    public static void main(String[] args) {
        
        FileWriter fileToWrite;
        try {
            fileToWrite = new FileWriter(fixedPath);
            
            //START (behaviour of 'Print text to console')
            
            int currentlySelected = mainTabPane.getSelectedIndex();
            Component currentlySelComp = mainTabPane.getComponent(currentlySelected);
            String compTitle = mainTabPane.getTitleAt(currentlySelected);
            String compName = currentlySelComp.getName();
            int componenentsCount = mainTabPane.getComponentCount();
            JTextArea textArea;
            textArea = (JTextArea) (((JViewport) (((JScrollPane) mainTabPane.getComponentAt(currentlySelected)).getViewport()))).getView();

            String textExtracted = textArea.getText();
            
            //END
            
            fileToWrite.write(textExtracted);
            
            fileSaved = true;
            
            String oldTitle =currentlySelComp.getName();
            
            System.out.println("Default file title: "+oldTitle);
            
            mainTabPane.setTitleAt(currentlySelected, fixedFileName);
            
            System.out.println("Replaced with: "+fixedFileName);
            
            fileToWrite.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
        
        
    }
    
}
