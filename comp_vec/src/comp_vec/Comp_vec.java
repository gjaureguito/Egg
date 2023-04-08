package comp_vec;

import java.util.Scanner;


public class Comp_vec {


    public static void main(String[] args) {
        // TODO code application logic here
         int numero=0,acum=0,band=0; 
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        numero = leer.nextInt();
        
        int[] vec1 = new int[numero];
        int[] vec2 = new int[numero];
        
        System.out.println("Ingrese vector 1:");
        for(int i=0; i<numero;i++) {
            vec1[i] = leer.nextInt();
        }
        
        System.out.println("Ingrese vector 2:");
        for(int i=0; i<numero;i++) {
            vec2[i] = leer.nextInt();
        }
        
        System.out.println("Compara:");
       
        for(int i=0; i<numero;i++) {
            if (vec1[i]!=vec2[i]) 
                band = 1; 
                
         }
        
        if (band == 1)
            System.out.println("los vectores no son iguales");
            else
            System.out.println("Los vectores son iguales");
                
        
    }

}