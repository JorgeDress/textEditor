/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.fileActions.changesManager;

import com.jorgedress.texteditor.main.writerAndReader.*;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author jorge
 */
public class FileRead1 extends com.jorgedress.texteditor.main.MainFrame {

    public static String writtenFile;
    public static String pathToWrittenFile;

    public static void main(String[] args) {

        String testPath = "/home/jorge/archivo de jorge.txt";

        pathToWrittenFile = testPath;

//        File fileToRead = new File(pathToWrittenFile);
//        
//        String file = fileToRead.toString();
//        System.out.println(file);
            


        


    }
    
    public static String readFile(String path) {
        
        String content = null;
        
        File file = new File(path);
        if (file.exists()) {
            try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("Reading file: "+file.getName());
            
            
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Error: File "+file.getName()+" does not exists.");
        }
        return null;
        
        
        
    }

}
