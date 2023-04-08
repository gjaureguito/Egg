package matriz_magica;

import java.util.Scanner;


public class Matriz_magica {

    public static void main(String[] args) {
         int[][] B = new int[3][3];  
         int [] fila = new int[3];  
         int [] columna = new int[3];   
         int diag = 0;
         leer_valores_matriz(B); 
         System.out.println("Matriz ingresada");
         mostrar_matriz(B); 
         cuadrado_magico (B,fila,columna,diag); 
        
    }
    
    
    public static void leer_valores_matriz(int B[][]) {
    Scanner leer = new Scanner(System.in);
    for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                System.out.println("Ingrese elemento " +"["+ Integer.toString(i)+","+Integer.toString(j)+"]: ");
                B[i][j] = leer.nextInt();
            }    
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
    
    public static void cuadrado_magico(int B[][], int fila[],int columna[],int diag){
               
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                 fila[i] = fila[i] + B[i][j]; 
                 columna[i] = columna[i] + B[j][i];
                 diag = diag + B[i][i];
            }
        }
        
        for(int i=0;i<3;i++){
            System.out.println("Suma fila " + Integer.toString(i+1) + " " + Integer.toString(fila[i])  );
            System.out.println("Suma columna " + Integer.toString(i+1)+" " + Integer.toString(columna[i])  );
        }
        System.out.println("Suma diagonal " +  Integer.toString(diag));
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
