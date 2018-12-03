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
public class queens {
    
    private int [][] chessTable;
    private int numOfQueens;
    
    public  queens(int numOfQueens){
        this.chessTable = new int [numOfQueens ] [numOfQueens];
        this.numOfQueens = numOfQueens;
    }
    public void solve(){
       
        if (setQueens(0))
        {
           
            printQueens();
        }
        
        else {
            System.out.println("there is no Solution ");
        }
    }
    public void printQueens(){
         
        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable.length; j++) {
                if(chessTable[i][j]==1){
                    System.out.print(" * ");
                }else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
            
        }
         System.out.println("");
    }

    private boolean setQueens(int colIndex) {
        if(colIndex==numOfQueens){
            return  true;
        }
        
        for (int rowIndex = 0; rowIndex < numOfQueens; rowIndex++) {
            if(isPlaceValid(rowIndex, colIndex)){
                chessTable[rowIndex][colIndex]=1;
                if(setQueens(colIndex+1)){
                    return  true;
                }
                //BACKTRAKING !!
                 chessTable[rowIndex][colIndex]=0;
            }
            
        }
          return  false;
    
    }

    private boolean isPlaceValid(int rowIndex, int colIndex) {
        
        
        for (int i=0 ; i<colIndex ; i++){
            
            if(chessTable[rowIndex][i]==1){
                return  false;
            }
        }
        for (int j = rowIndex ,  p = colIndex ; j >= 0 && p >=0 ; j-- , p --) {
                if(chessTable[j][p]==1) 
                    return  false;
            }
        
          for (int j = rowIndex ,  p = colIndex ; j<chessTable.length  && p >=0 ; j++ , p --) {
                if(chessTable[j][p]==1) 
                    return  false;
            }
        
       
        
        
       
       return true;
    }
}
