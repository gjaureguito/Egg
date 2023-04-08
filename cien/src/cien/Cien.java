/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cien;


import java.util.Scanner;

public class Cien {

    public static void main(String[] args) {
       
         int numero=0,acum=0,band=0; 
        
        Scanner leer = new Scanner(System.in);
      
       int[] vector = new int[100];
       
       for(int i=0;i<vector.length;i++)
            vector[i]=i+1;
       
       for(int i=99;i>=0;i--)
            System.out.println(vector[i]);
               
        
        
        
       


    }
    
}
