/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.fileActions;

import javax.swing.*;

/**
 *
 * @author jorge
 */
public class NewFile extends com.jorgedress.texteditor.main.MainFrame {
    
    public NewFile() {
    
        //newFileScr.setName(defaultTitle);
        
    }
    
    public static void main(String[] args) {
        
        int fileNumber = mainTabPane.getTabCount();
        String defaultTitle = "NewFile(" +  fileNumber  + ").txt";
        
        if (defaultTitle.equals("NewFile(0).txt")) {
            defaultTitle = "NewFile.txt";
        }
        
        JTextArea txtArea = new JTextArea();
        
        JScrollPane newFileScr = new JScrollPane();
        newFileScr.setViewportView(txtArea);
        newFileScr.setName(defaultTitle);
        
        mainTabPane.add(defaultTitle, newFileScr);
        
        
        System.out.println("Created file with index: "+fileNumber);
        System.out.println("Default title: "+defaultTitle);
        
    }
    
}
