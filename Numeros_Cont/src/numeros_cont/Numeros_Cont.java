/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_cont;
import java.util.Scanner; 

public class Numeros_Cont {

    public static void main(String[] args) {
        String x = "";
        int[] vector = new int[5];
        int[] cont = new int[5];
        Scanner leer = new Scanner(System.in);
        
        
        
        for(int i=0;i>5;i++)
            cont[i]=0;
        
        for(int i=0;i<5;i++) {
            System.out.println("Ingrese numero " + Integer.toString(i+1));
            vector[i]= leer.nextInt();
         }
        
        for(int i=0;i<5;i++) {
            x = Integer.toString(vector[i]);
            
            switch(x.length()) {
                
                case 1: 
                    cont[0]++;
                    break; 
                    
                case 2: 
                    cont[1]++;
                    break; 
                    
                case 3: 
                    cont[2]++;
                    break; 
                    
                case 4: 
                    cont[3]++;
                    break; 
                
                 case 5: 
                    cont[4]++; 
                    break; 
              }
            
        }
        
        for(int i=0;i<5;i++) {
            System.out.println("Numeros con digitos " + Integer.toString(i+1));
            System.out.println(Integer.toString(cont[i]));
         }
        
        
        
    
}
}