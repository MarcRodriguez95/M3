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
public class Semàfor {
    public static final int VALOR_SECRETO = 4;
    public static final int MAX_INTENTOS = 3;
        
    public static void main (String [] args){
       
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        int i = 0;
        
        int intentos = MAX_INTENTOS;
        
        boolean acierto = false;
        
        System.out.println("Comienza el juego... ");
        
        System.out.println("Adivina el numero secreto entre el 0 y el 10.");
        
       numero = teclado.nextInt();
        
        while (intentos < 3){
            
            System.out.print("Quin valor creus que és? ");
            
            

            intentos = intentos - 1;

            if (VALOR_SECRETO != numero) {
             System.out.print("Has fallat! Torna a intentar-ho.");
            } else {
                
            acierto = true;
            }
            
         if (numero == VALOR_SECRETO) {
            
            System.out.print("Has acertado");
        
        }else {
            System.out.print("Demasiados fallos: has perdido");
        
        }
              
        
        }
        
        
    }
    
    
    
}
