/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perceptron;

import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alexandre_Marinho
 */
public class Trening {

    private double n = 0.1;
    private int bias = -1;

    public int ativacao(double resultado) {
        if (resultado < 39.7) {
            return 1;
        } else {
            if (resultado >= 39.7 && resultado < 70) {
                return 2;
            } else {
                return 3;
            }
        }

    }

    public double[] matrizPeso() {
        double[] w = new double[6];
        int i;
        Random r = new Random();
        for (i = 0; i < 6; i++) {
            w[i] = r.nextDouble(1);
            if (i % 2 == 0) {
                w[i] *= -1;
            }
        }
        return w;
    }

    public double[] treinamento(List<States> mps) {
        int epc = 0;
        double w[] = matrizPeso();
        boolean erro = false;
        Double resultado = 0.0;
        int y = 0;
        do {
            erro = false;
            for (States s : mps) {
                resultado += w[0] * s.getAge(); // resultado = u
                resultado += w[1] * s.getBodyTemp();
                resultado += w[2] * s.getBs();
                resultado += w[3] * s.getDiastolicBP();
                resultado += w[4] * s.getHeartRate();
                resultado += w[5] * s.getSystolicBP();
                resultado -= bias;
         
                y = ativacao(resultado);

                if (y != s.getRiskLevel()) {
                    w[0] = w[0] + n * (s.getRiskLevel() - y) * s.getAge();//arrumar o risk
                    w[1] = w[1] + n * (s.getRiskLevel() - y) * s.getBodyTemp();
                    w[2] = w[2] + n * (s.getRiskLevel() - y) * s.getBs();
                    w[3] = w[3] + n * (s.getRiskLevel() - y) * s.getDiastolicBP();
                    w[4] = w[4] + n * (s.getRiskLevel() - y) * s.getHeartRate();
                    w[5] = w[5] + n * (s.getRiskLevel() - y) * s.getSystolicBP();
                    erro = true;
                }
            }
            epc++;
        } while (epc < 1000 && erro == false);
        return w;
    }

    public int operacoes(States s, double[] w) {
        double resultado = 0.0;
        resultado += w[0] * s.getAge();
        resultado += w[1] * s.getBodyTemp();
        resultado += w[2] * s.getBs();
        resultado += w[3] * s.getDiastolicBP();
        resultado += w[4] * s.getHeartRate();
        resultado += w[5] * s.getSystolicBP();
        
        return ativacao(resultado);
    }
}
