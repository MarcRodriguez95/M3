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
public class array_intrnumeros {
    
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        
        int r;
       
        int[] a = new int[5];
        
        int maximo = a[0];
        
        int numero;
        
        for(r = 0; r < a.length; r++){
            System.out.println("Introduce los numeros del array");
            
           numero = teclado.nextInt();
            
           a[r] = numero;
           
           if (a[r] > maximo){
               
               maximo = a[r];
           
           }
        
        }System.out.println("El maximo es: " + maximo);
        
        
    } 
}
