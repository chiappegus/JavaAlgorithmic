/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickselect;

/**
 *
 * @author gchiappe
 */
public class app {
    
    public static void main(String[] args) {
        int[] nums = {1,5,4,8,-2};
        
        Quickselect q = new Quickselect(nums);
        //aca busca el mas grande si es uno y sino busca si es 2 el segundo mas grande
        System.out.println(q.select(2));
        
    }
    
}
