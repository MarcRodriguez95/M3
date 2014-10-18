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

        System.out.print("introducir nota");
        
        double n;

        n = entrada.nextDouble();

        String fin ;

        if (n >= 9 && n <= 10) {

            fin = ("Excelente");
            
        } else if (n >= 7 && n <= 8) {

            fin = ("Notable");
            
        } else if (n >= 6 && n < 7) {

            fin = ("Bé");
            
        } else if (n >= 5 && n < 6) {

            fin = ("Suficient");
            
        } else if (n >= 0 && n < 5) {

            fin = ("Suspés");
           System.out.print(fin);
        }   
      

    }
  
}

           
    
    

  


 
