/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main.writerAndReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class FileRead {

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

        try {
            content = new String(Files.readAllBytes(Paths.get(pathToWrittenFile)));
            System.out.println(content);
        } catch (IOException ex) {
            Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}