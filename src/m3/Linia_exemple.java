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
public class Linia_exemple {
    public static void main (String []args){
        
        int i = 0;
        
        int n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuantos caracteres quiere que se impriman por pantalla?");
        
        n = teclado.nextInt();
        
        while (i < n){
            
            System.out.println('-');
            
            i = i + 1;
        }
        System.out.println("Hay " + n + " caracteres");
              
            
    
    }
    
}
