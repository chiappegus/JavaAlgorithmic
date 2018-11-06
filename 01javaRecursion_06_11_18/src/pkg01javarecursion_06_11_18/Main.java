/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01javarecursion_06_11_18;

import java.io.PrintStream;

/**
 *
 * @author gchiappe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        algorithm algorithm1 = new algorithm();
       
        System.out.println("algoritmo"+algorithm1.sumIterate(100000));
        
            long n = System.currentTimeMillis();
           System.out.println("tiermpo "+n);
        System.out.println("algoritmo"+algorithm1.sumRecursuib(10));
        long m = System.currentTimeMillis();
        System.out.println("tiermpo "+m);
        //2 -- 5 
            algorithm1.buildLayer(4);
            
            algorithm1.buildInversoLayer(4);
        
        System.out.println("algoritmo"+algorithm1.factorial(4));
       // System.out.println("algoritmo"+algorithm1.factorialAcumulador(1,2));
        System.out.println("algoritmo"+algorithm1.calcularFactorial(20));
        
        
        
    }
    
}
