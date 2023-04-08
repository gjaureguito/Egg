
package operaciones;

import java.util.Scanner; 

public class Operaciones {

    public static void main(String[] args) {
         
        int num1=0, num2=0, res=0;
        int op = 0; 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese num1 : ");        
        num1 = leer.nextInt();
        System.out.println("Ingrese num2 : ");        
        num2 = leer.nextInt();
        System.out.println("Ingrese operacion: ");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Producto");
        System.out.println("4- Division");
        op = leer.nextInt();
        switch(op) {
            case 1: 
                res = suma(num1,num2);
                break; 
            case 2:
                res = resta (num1,num2);
                break; 
            case 3:
                res = producto (num1,num2);
                break; 
            case 4:
                res = division (num1,num2);
                break;       
           
        }
        System.out.println("Resultado: " + res);
          
    }
     
    public static int suma(int num1,int num2) {
          return num1+num2; 
    }
        
    public static int resta(int num1,int num2) {
          return num1-num2; 
    }
   
    public static int producto(int num1,int num2) {
          return num1*num2; 
    }
    
    public static int division(int num1,int num2) {
          return num1/num2; 
    }

    }
    

