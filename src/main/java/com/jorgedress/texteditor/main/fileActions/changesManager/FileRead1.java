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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class FileRead1 {

    public static String writtenFile;
    public static String pathToWrittenFile;

    public static void main(String[] args) {

        String testPath = "/home/jorge/archivo de jorge.txt";

        pathToWrittenFile = testPath;

//        File fileToRead = new File(pathToWrittenFile);
//        
//        String file = fileToRead.toString();
//        System.out.println(file);
            
            String content;

        


    }
    
    public static String readFile(String path) {
        
        File file = new File(path);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRead1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        return null;
    }

}
