/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.configs.themes;

import com.jorgedress.texteditor.main.MainFrame;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;


/**
 *
 * @author jorge
 */
public class ThemeDark implements Runnable {

    @Override
    public void run() {
        while (true) {
            int tabs = com.jorgedress.texteditor.main.MainFrame.mainTabPane.getTabCount();
            for(int i=0;i<tabs; i++) {

            JTextArea tArea = (JTextArea) (((JViewport) (((JScrollPane)
                com.jorgedress.texteditor.main.MainFrame.mainTabPane.getComponentAt(i)).getViewport()))).getView();

            tArea.setForeground(java.awt.Color.WHITE);

            tArea.setBackground(java.awt.Color.DARK_GRAY);
        }
        }
        
    }
    
    public static void main(String args[]) {
        (new Thread(new ThemeDark())).start();
    }
    
}
