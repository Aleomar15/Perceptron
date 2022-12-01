/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perceptron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Alexandre_Marinho
 */
public class MomPregnant {

    private String path;
    private List<States> mom;
    private List<States> momTest;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<States> getMomTest() {
        return momTest;
    }

    public void setMomTest(List<States> momTest) {
        this.momTest = momTest;
    }

    public List<States> getMom() {
        return mom;
    }

    public void setMom(List<States> mom) {
        this.mom = mom;
    }

    public List<States> pegarTreino() throws IOException {
        int age;
        double systolicBP;
        double diastolicBP;
        double bs;
        double bodyTemp;
        double heartRate;
        int riskLevel;
        path = "../BD/BDT.csv";
        mom = new ArrayList<States>();
        Reader r = Files.newBufferedReader(Paths.get(path));
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        line = br.readLine();
        while (line != null) {
            String[] vect = line.split(",");
            age = Integer.parseInt(vect[0]);
            systolicBP = Double.parseDouble(vect[1]);
            diastolicBP = Double.parseDouble(vect[2]);
            bs = Double.parseDouble(vect[3]);
            bodyTemp = Double.parseDouble(vect[4]);
            heartRate = Double.parseDouble(vect[5]);
            if (vect[6].equals("low risk")) {
                vect[6] = "1";
            } else {
                if (vect[6].equals("mid risk")) {
                    vect[6] = "2";
                } else {
                    vect[6] = "3";
                }
            }
            riskLevel = Integer.parseInt(vect[6]);
            States st = new States(age, systolicBP, diastolicBP, bs, bodyTemp, heartRate, riskLevel);
            mom.add(st);
            line = br.readLine();
        }
       
        return mom;
    }
     public List<States> pegarTest() throws IOException {
        int age;
        double systolicBP;
        double diastolicBP;
        double bs;
        double bodyTemp;
        double heartRate;
        int riskLevel;
        path = "../BD/BdM.csv";
        momTest = new ArrayList<States>();
        Reader r = Files.newBufferedReader(Paths.get(path));
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        line = br.readLine();
        while (line != null) {
            String[] vect = line.split(",");
            age = Integer.parseInt(vect[0]);
            systolicBP = Double.parseDouble(vect[1]);
            diastolicBP = Double.parseDouble(vect[2]);
            bs = Double.parseDouble(vect[3]);
            bodyTemp = Double.parseDouble(vect[4]);
            heartRate = Double.parseDouble(vect[5]);
            if (vect[6].equals("low risk")) {
                vect[6] = "1";
            } else {
                if (vect[6].equals("mid risk")) {
                    vect[6] = "2";
                } else {
                    vect[6] = "3";
                }
            }
            riskLevel = Integer.parseInt(vect[6]);
            States st = new States(age, systolicBP, diastolicBP, bs, bodyTemp, heartRate, riskLevel);
            momTest.add(st);
            line = br.readLine();
        }
       
        return momTest;
    }
}
