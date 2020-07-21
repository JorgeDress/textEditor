/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.fileActions.changesManager;

import static com.jorgedress.texteditor.main.MainFrame.*;
import static com.jorgedress.texteditor.main.MainFrame.mainTabPane;
import static com.jorgedress.texteditor.main.writerAndReader.FileRead.writtenFile;
import org.apache.commons.lang3.StringUtils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class ChangesManager {
    
    public static boolean savedChanges;
    
    public static void main(String[] args) {
        
        
        
    }
    public static void proveSaved(String inFile, String outFilePath) {
        String contentOut = com.jorgedress.texteditor.main.fileActions.changesManager.FileRead1.readFile(
                outFilePath);
        
        if(inFile.equals(contentOut)) {
            System.out.println("The text in the file DOES match with the text in the editor:"
                    + "\nText in the file:\n"+contentOut+"\nText in the editor:\n"+inFile);
            int item = mainTabPane.getSelectedIndex();
            Component toClose = mainTabPane.getComponentAt(item);
            mainTabPane.remove(toClose);
        } else if (!inFile.equals(contentOut)) {
            String diff= StringUtils.difference(inFile, contentOut);
            System.out.println("The text in the files do NOT match:"+"\nDiference:\n"+diff);
            int jopResult = JOptionPane.showOptionDialog(null,
                    "There are not saved changes,\nif you close the file you will lose them.\n"
                    + "Are you sure do you want to exit?",
                    "Warning",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION, null, null, null);
        switch (jopResult) {
                case JOptionPane.YES_OPTION:
                    int item = mainTabPane.getSelectedIndex();
                    Component toClose = mainTabPane.getComponentAt(item);
                    mainTabPane.remove(toClose);
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.getRootFrame().dispose();
                    break;
                default:
                    JOptionPane.getRootFrame().dispose();
                    break;
        }
        }
        
    }
    public static void proveNotSaved() {
        int jopResult = JOptionPane.showOptionDialog(null,
                    "Your file is not saved, if you \nclose it, you will probably lose it\n"
                    + "Do you want to save your file?",
                    "Warning",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION, null, null, null);
        switch (jopResult) {
                case JOptionPane.YES_OPTION:
                    com.jorgedress.texteditor.main.fileActions.SaveFile.main(null);
                    com.jorgedress.texteditor.main.MainFrame.Saved = true;
                    int item = mainTabPane.getSelectedIndex();
                    Component toClose = mainTabPane.getComponentAt(item);
                    mainTabPane.remove(toClose);
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.getRootFrame().dispose();
                    break;
                default:
                    JOptionPane.getRootFrame().dispose();
                    break;
        }
        int selectedIndex = mainTabPane.getSelectedIndex();
        Component selComp = mainTabPane.getComponent(selectedIndex);
        
    }

}
