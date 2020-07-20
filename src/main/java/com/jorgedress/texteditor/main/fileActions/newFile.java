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
public class newFile extends com.jorgedress.texteditor.main.mainFrame {
    
    public newFile() {
    
        //newFileScr.setName(defaultTitle);
        
    }
    
    public static void main(String[] args) {
        
        int fileNumber = mainTabPane.getTabCount();
        String defaultTitle = "NewFile(" +  fileNumber  + ").txt";
        
        JTextArea txtArea = new JTextArea();
        
        JScrollPane newFileScr = new JScrollPane();
        newFileScr.setViewportView(txtArea);
        newFileScr.setName(defaultTitle);
        
        mainTabPane.add(defaultTitle, newFileScr);
        
        
        System.out.println(fileNumber);
        System.out.println(defaultTitle);
        
    }
    
}
