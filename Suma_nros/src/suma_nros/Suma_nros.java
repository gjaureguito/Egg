package suma_nros;
import java.util.Scanner; 

public class Suma_nros {

    public static void main(String[] args) {
        int numero=0,acum=0; 
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        numero = leer.nextInt();
        
        int[] vector = new int[numero];
        
        for(int i=0; i<numero;i++) {
            vector[i] = leer.nextInt();
            acum = acum+ vector[i];             
        }
        
        System.out.println("La suma de nros es: " + Integer.toString(acum));
        
    }
    
}
