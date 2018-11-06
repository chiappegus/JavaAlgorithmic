/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01javarecursion_06_11_18;

/**
 *
 * @author gchiappe
 */
public class algorithm {
    
    public int sumIterate(int n){
        int result =0;
        for (int i = 0; i <= n; i++) 
            result=result+i;
            
        return result;
    
}
    
    public  int  sumRecursuib(int n) {
        
        
        if(n==1) return 1;
        return n + sumRecursuib( n-1);
        
    }
    
    //2 5
    public  void buildLayer(int height) {
        if(height==0) return ;
        
        buildLayer( height-1);
        
        System.out.println(height); 
        //return "fin"+height;
    }
    
    public  void buildInversoLayer(int height) {
        if(height==0) return ;
        
        System.out.println(height); 
        
        buildInversoLayer( height-1);
    }
    
    public  int  factorial(int n) {
        if(n==1) return n;
        return n * factorial( n-1);
    }
    
     public  int  factorialAcumulador(int acumulador ,int n) {
        if(n==1) return acumulador;
        return  factorialAcumulador( acumulador*n , n-1);
    }
     
     
     public  int  calcularFactorial(int n) {
        return factorialAcumulador( 1 , n);
    }
}

