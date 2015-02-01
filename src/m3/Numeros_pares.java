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

//programa que suma solo pares, no inpares. Hasta que el usuario introduzca un 0.
public class Numeros_pares {
    
    public static void main (String [] args){
        
        Scanner ordenador = new Scanner(System.in);
        
        int n;
        
        int suma = 0;
        
        System.out.println("Introduzca una serie de numeros");
        
        n = ordenador.nextInt();
        
        while (n != 0){
            
            
            
            if (n %2 == 0){
            
                suma = suma + n;
            
            }
            n = ordenador.nextInt();
            //Al ponerlo en el while, no lo suma bien
        }
        System.out.print("El resultado es :" + suma);
    
    }
    
}
