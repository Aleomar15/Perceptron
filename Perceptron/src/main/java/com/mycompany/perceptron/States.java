/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perceptron;

/**
 *
 * @author Alexandre_Marinho
 */
public class States {
    private int age;
    private double systolicBP;
    private double diastolicBP;
    private double bs;
    private double bodyTemp;
    private double heartRate;
    private int riskLevel;

    public States(int age, double systolicBP, double diastolicBP, double bs, double bodyTemp, double heartRate, int riskLevel) {
        this.age = age;
        this.systolicBP = systolicBP;
        this.diastolicBP = diastolicBP;
        this.bs = bs;
        this.bodyTemp = bodyTemp;
        this.heartRate = heartRate;
        this.riskLevel = riskLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(double systolicBP) {
        this.systolicBP = systolicBP;
    }

    public double getDiastolicBP() {
        return diastolicBP;
    }

    public void setDiastolicBP(double diastolicBP) {
        this.diastolicBP = diastolicBP;
    }

    public double getBs() {
        return bs;
    }

    public void setBs(double bs) {
        this.bs = bs;
    }

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(int riskLevel) {
        this.riskLevel = riskLevel;
    }
    
}
