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
public class Suma_while {
    
    public static void main (String [] args){
        
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        
    
        
        int i = 1;
        
        int suma = 0;
        
        System.out.println("Escriba 10 numeros"); 
         
         
         
        while (i <= 10){
            
            numero = teclado.nextInt();
                    
            suma = suma + numero;
            
            i = i + 1;
        
        }
        

        
        System.out.print("La suma total es: ");
        
        System.out.println(suma);
        
        
        
        
    
    
    }
    
}
