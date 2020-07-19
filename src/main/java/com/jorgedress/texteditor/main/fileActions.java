/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class fileActions extends com.jorgedress.texteditor.main.mainFrame {
    public static void newFile() {
        
    }
    public static void closeFile() {
        
    }
    public static void saveFile() {
        
    }
    public static void exit(boolean Saved) {
        if (!Saved) {
            
            int jopResult = JOptionPane.showOptionDialog(null,
                    "There are not saved changes, if you close the file you will lose them."
                    + "Are you sure do you want to exit?",
                    "Warning",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION, null, null, null);
            
            switch (jopResult) {
                case JOptionPane.YES_OPTION:
                    System.exit(0);
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.getRootFrame().dispose();
            }
            
        } else {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        switch (args.toString()) {
                case "new":
                    newFile();
                    break;
                case "exit":
                    exit(true);
                    break;
                case "save":
                    saveFile();
                    break;
                case "close":
                    closeFile();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "There was an error. Please report it in GitHub (Under Help, About, GitHub Project Page).",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                            );
                    break;
        }
    }
}
