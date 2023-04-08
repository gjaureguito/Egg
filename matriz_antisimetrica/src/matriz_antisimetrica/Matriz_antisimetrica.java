package matriz_antisimetrica;

import java.util.Random;
import java.util.Scanner;


public class Matriz_antisimetrica {

    public static void main(String[] args) {
           // int[][] A = new int[3][3]; 
            int[][] B = new int[3][3]; 
            // Tenemos un array de 4x4 elementos.
            int A[][] = {{0,-2,4},
                       {2,0,2},
                       {-4,-2,0}};
            
            transpone_matriz(A,B);
            System.out.println("La matriz que deberas ingresar para producir la antisimetrica es: ");
            mostrar_matriz(B); 
            leer_valores_matriz(B);
            compara_matriz(A,B);
            
            
    }
    
    
    public static void mostrar_matriz(int vec[][]) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                  System.out.print(String.valueOf(vec[i][j])+" ");    
            }
            System.out.println("");    
        }
        System.out.println(" ");
        System.out.println(" ");
}
    
    


public static void leer_valores_matriz(int B[][]) {
    Scanner leer = new Scanner(System.in);
    for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                System.out.println("Ingrese elemento " +"["+ Integer.toString(i)+","+Integer.toString(j)+"]: ");
                B[i][j] = leer.nextInt();
            }    
}
    

public static void transpone_matriz(int A[][], int B[][]) {
           for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                B[j][i] = A[i][j];
            }
        }
    
}    
    

    
public static void compara_matriz(int A[][], int B[][]) {
    boolean band = false; 
    
    for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
               if (A[i][j] != B[i][j]){
                       band = true; 
                       break; 
                }
            }
    }
    if (band == true)
        System.out.println("La matriz ingresada es la antisimetrica");
    else
        System.out.println("La matriz ingresada no es la antisimetrica");

}
  
 

}    
    
