
package multiplos;

import java.util.Scanner; 
public class Multiplos {

    public static void main(String[] args) {
        int num1=0, num2=0; 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese num1 : ");        
        num1 = leer.nextInt();
        
        System.out.println("Ingrese num2 : ");        
        num2 = leer.nextInt();
        multiplo(num1,num2);
                
    }
    
    public static void multiplo(int num1,int num2) {
        
        if (num1%num2==0) {
            System.out.println("Num2 es multiplo de Num1 ");
        } else {
            System.out.println("Num2 no es multiplo de Num1");            
        }
        
        
        
    }
    
    
    
    
}
