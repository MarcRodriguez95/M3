/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;
import java.util.Scanner;
/**
 *
 * @author Marc
 */
public class Ejercicio_notas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introducir nota");
        
        double n;

        n = entrada.nextDouble();

        String fin = ("Tu nota és: ");
        

        if (n >= 9.75 && n <= 10.0) {

            System.out.println(fin + "M");
            
        } else if (n >= 8.5 && n < 9.75) {

            System.out.println(fin + "E"); 
            
        } else if (n >= 6.5 && n < 8.5) {

            System.out.println(fin + "N");
            
        } else if (n >= 5.0 && n < 6.5) {

            System.out.println(fin + "A");
            
        } else if (n >= 0.0 && n < 5.0) {

            System.out.println(fin + "S");
           
          
        }   
   

    }
  
}

           
    
    

  


 
