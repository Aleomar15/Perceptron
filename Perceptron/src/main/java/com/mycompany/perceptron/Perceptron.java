/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.perceptron;

import java.io.IOException;
import java.util.List;
/**
 *
 * @author Alexandre_Marinho
 */
public class Perceptron {

    public static void main(String[] args) throws IOException {
        
        MomPregnant  mp = new MomPregnant();
        Trening t =new Trening();
       int acerto = 0;
       double ac = 0.0;
       double w[] = t.treinamento(mp.pegarTreino());
       for(States s : mp.pegarTest()){
           int vect = t.operacoes(s, w);
           if(vect == s.getRiskLevel()){
               acerto++;
           }
           
       }
       ac = (acerto*100)/mp.pegarTest().size();
       System.out.println("ACURACE : " +ac );
        
        
       
    }
}
