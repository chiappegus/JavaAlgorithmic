/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queens;

/**
 *
 * @author gchiappe
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      queens problem =  new  queens(9);
      problem.solve();
    }
    
}
