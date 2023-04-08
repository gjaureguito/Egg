
package promedio;
import java.util.Scanner; 


public class Promedio {
    public static void main(String[] args) {
        double alt = 0;
        double sum = 0; 
        int cant =0; 
        int p =0; 
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese cantidad de personas: ");        
        cant = leer.nextInt();
        
        
        for (int i=0; i<cant;i++) {
            System.out.println("Persona " + Integer.toString(i+1));  
            System.out.println("Ingrese altura: ");        
            alt = leer.nextDouble();        
            sum = sum + alt; 
            if (alt<1.60){
                p++;
            }
        }
        System.out.println("Promedio de estaturas gral: " + Double.toString(sum/cant));
        System.out.println("Promedio de estaturas menores a 1.60: " + Double.toString(sum/p));
        
        
}
}