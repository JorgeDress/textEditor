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
        
        int currentlySelected = mainTabPane.getSelectedIndex();
        JTextArea textArea;
        textArea = (JTextArea) (((JViewport) (((JScrollPane) mainTabPane.getComponentAt(currentlySelected)).getViewport()))).getView();
        
        JViewport viewPort;
        viewPort = ((JViewport) (((JScrollPane) mainTabPane.getComponentAt(currentlySelected)).getViewport()));
        
        JScrollPane scroll;
        scroll = (JScrollPane) mainTabPane.getComponentAt(currentlySelected);
        
        System.out.println("Created file with index: "+fileNumber);
        System.out.println("Last title (JTextArea): "+textArea.getName());
        System.out.println("Last title (JViewPort): "+viewPort.getName());
        System.out.println("Last title (JScrollPane): "+scroll.getName());
        
        
    }
    
}
