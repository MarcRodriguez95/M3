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
public class Taula_Multiplicar {
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quina taula de multiplicar vols? ");
        
        int taula = entrada.nextInt();
        
        entrada.nextLine();
        
        int i = 10;
        
        while (i >= 1) {
            
            int resultat = taula*i;
            System.out.println(taula + " * " + i + " = " + resultat);
            i = i - 1;
        }
       System.out.println("Aquesta ha estat la taula del " + taula); 
        
    }    
}
