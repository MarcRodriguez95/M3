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
public class Vocal_consonante {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        
        int letra;
     
        String consonante = ("Es consonante");
        
        String vocal = ("Es vocal");
        
        System.out.println("Ingrese letra");
        letra=teclado.nextInt();
        
        if (letra=='a' && letra=='e' && letra=='i' && letra=='o' && letra=='u') {
            
            System.out.println(vocal);
        
        }else {
            
            System.out.println(consonante);
        }   
        
        
        
        }
        
        
    
    }
    

