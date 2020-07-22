/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.writerAndReader;

import static com.jorgedress.texteditor.main.MainFrame.mainTabPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jorge
 */
public class FileRead {

    public static void main(String[] args) {
        JFileChooser folderChooser = new JFileChooser();

        folderChooser.setDialogTitle("Save file...");

        FileFilter textFilter = new FileNameExtensionFilter("Simple text Files (*.txt)", "txt");

        folderChooser.setFileFilter(textFilter);

        int returnVal = folderChooser.showOpenDialog(null);
        
        String content = null;

        if (returnVal == folderChooser.APPROVE_OPTION) {

            File choosenFile = folderChooser.getSelectedFile();

            if (choosenFile.exists()) {
                try {
                    
                    Scanner scanFile = new Scanner(choosenFile);
                    content =scanFile.nextLine();
                    while(scanFile.hasNextLine()) {
                        content += "\n"+scanFile.nextLine();
                    }
                
                JScrollPane openFile = new JScrollPane();
                
                JTextArea fileText = new JTextArea();
                
                fileText.setText(content);
                
                openFile.setViewportView(fileText);
                
                mainTabPane.addTab(choosenFile.getName(), openFile);
                               
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex.getMessage());
                }
            }

        }
    }

}
