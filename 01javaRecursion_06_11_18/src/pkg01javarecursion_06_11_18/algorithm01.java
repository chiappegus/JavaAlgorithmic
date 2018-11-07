/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01javarecursion_06_11_18;
import java.util.Arrays;

/**
 *
 * @author hpgus
 */
public class algorithm01 {
    
    private int[]array;
    
    public algorithm01(int[] array){
        this.array = array;
    }
    public int binarySearch(int item){
    return binarySearch(0, array.length-1, item);
    
        
    }
    public int linearSearch(int item){
        for (int i = 0; i < array.length; ++i)
           if(array[i]== item)
               return i;
        return -1;
    }
    
    
    private int binarySearch(int startIndex , int endIndex , int item){
        if(endIndex<startIndex){
            System.out.println("the item is not in this present array...");
            return -1;
        }
        int middleIndex = (startIndex+endIndex)/2;
        
        if(item==array[middleIndex]){
            return middleIndex;
        }else if(item<array[middleIndex]){
            return  binarySearch(startIndex , middleIndex-1 ,  item);
        }else if(item>array[middleIndex]){
            return  binarySearch(middleIndex+1 , endIndex ,  item);
        }
        return -1;
       
    }
    
    public static void main(String[] args) {
        
        int[]array={1,5,3,8,9,4,10,-3};
        
        algorithm01 al = new algorithm01(array);
        System.out.println(al.linearSearch(4));
        //binari funciona mejor con la forma ordenada
        System.out.println(al.binarySearch(4));
        
         int[]arrayO={1,5,3,8,9,4,10,-3};
         Arrays.sort(arrayO);
          algorithm01 alO = new algorithm01(arrayO);
          System.out.println("ARRAYS ORDENADo");
           System.out.println(alO.binarySearch(4));
    }
}


