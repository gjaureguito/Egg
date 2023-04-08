
package numeros;

import java.util.Scanner; 

public class Numeros {

    public static void main(String[] args) {
        int cant =0; 
        int cont = 1; 
        int num=0;
        int max,min,sum;
        max=sum=0;
        min=999999;
        Scanner leer = new Scanner(System.in);
        
               
        System.out.println("Ingrese cantidad de numeros: ");        
        cant = leer.nextInt();
        
        do {
            
            System.out.println("Ingrese numero " + Integer.toString(cont)+":");        
            num = leer.nextInt();
            cont++;
            sum = sum + num;
            if (num>max){
                max = num;
            }
            
            if (num<min){
                min = num;
            }
            
            
        } while (cont<=cant);
        
        System.out.println("Valor maximo: " + Integer.toString(max));
        System.out.println("Valor minimo: " + Integer.toString(min));
        System.out.println("Promedio: " + Double.toString(sum/cont));
        
        
    }
    
}
