
package aleatorio;
import java.util.Scanner;

public class Aleatorio {


    public static void main(String[] args) {
        // TODO code application logic 
        int N=0,num=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros: ");
        N = leer.nextInt();
        int[] vector = new int[N];
        
        for(int i=0;i<N;i++)
            vector[i] = (int) (Math.random()*100);
        
        System.out.println("Ingrese numero a buscar: ");
        num = leer.nextInt();
        
        
        
        
        
        
        
      
        
        
    }
    
}
