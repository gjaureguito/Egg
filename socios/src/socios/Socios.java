/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socios;
import java.util.Scanner;


public class Socios {
    public static void main(String[] args) {
        double monto = 0;
        double desc = 0; 
        String letra; 
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tipo de socio: ");        
        letra = leer.nextLine();
        
        System.out.println("Ingrese monto: ");        
        monto = leer.nextDouble();
        
         System.out.println("Monto total: " + monto);
         System.out.println("Socio tipo " + letra);
        
         if (letra.equalsIgnoreCase("a")) {
             desc = monto*0.50;
             monto = monto - desc; 
             System.out.println("Monto a pagar con descuento: " + monto);        
     
        }
        
           if (letra.equalsIgnoreCase("b")) {
             desc = monto*0.35;
             monto = monto - desc; 
             System.out.println("Monto a pagar con descuento: " + monto);        
          }
           
             if (letra.equalsIgnoreCase("c")) {
                System.out.println("Monto a pagar sin descuento: " + monto);        
           }
         
    }
    
}
