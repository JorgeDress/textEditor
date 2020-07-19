/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgedress.texteditor.main;

import javax.swing.*;

/**
 *
 * @author jorge
 */
public class fileActions extends com.jorgedress.texteditor.main.mainFrame {

    public static int filesOpened = 1;
    //public static int fileNumber;
    public static String atitle = "NewFile("+(filesOpened+1)+").txt";
    //public static String atitle;
    //public static JTabbedPane newtbp;

    public fileActions() {
        //fileNumber = 0 + tabPane.getTabCount();
        //aatitle = "HII";
        //atitle = aatitle;
        //newtbp = new JTabbedPane();
    }

    public static void newFile() {
        System.out.println(atitle);
        //tabPane.add(atitle, newtbp);

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

    }
}
