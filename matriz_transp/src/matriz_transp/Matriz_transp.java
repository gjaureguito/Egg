
package matriz_transp;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

public class Matriz_transp {

    public static void main(String[] args) {
        
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
       
        
       rellena_matriz(A);
       mostrar_matriz(A); 
       transpone_matriz(A,B);
       mostrar_matriz(B); 

    }

public static void rellena_matriz(int A[][]) {
     Random random = new Random();
    for(int i=0;i<4;i++)
            for(int j=0;j<4;j++) 
                A[i][j] = random.nextInt(100);
    
}

public static void mostrar_matriz(int vec[][]) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++) {
                  System.out.print(String.valueOf(vec[i][j])+" ");    
            }
            System.out.println("");    
        }
    System.out.println(" ");
    System.out.println(" ");
}

public static void transpone_matriz(int A[][], int B[][]) {
           for(int i=0;i<4;i++){
            for(int j=0;j<4;j++) {
                B[j][i] = A[i][j];
            }
        }
    
}


}












