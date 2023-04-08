/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;
import java.util.Scanner; 
/**
 *
 * @author Guillermo Jaureguito
 */
public class Equipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] vector = new String[5];
        Scanner leer = new Scanner(System.in);
        
        for(int i=0;i<5;i++) {
            System.out.println("Ingrese nombre " + Integer.toString(i+1));
            vector[i]= leer.nextLine();
         }
        
        System.out.println("Los nombres ingresados son: ");
        
        for(int i=0;i<5;i++) {
            System.out.println(vector[i]);
         }
       
    }
    
}
