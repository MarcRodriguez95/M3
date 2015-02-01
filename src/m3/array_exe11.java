/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;


import java.util.Random;
/**
 *
 * @author Marc
 */
public class array_exe11 {
    
    public static void main(String[] args) {
        
        int i;
        
        int[] vector = new int[10];
        
        int minimo;
        
        int numero;
        
        Random num = new Random();
        
        System.out.println("Los numeros del array ");
        
        for(i = 0; i < vector.length; i++){
            
            numero = num.nextInt(9);
            
            System.out.print(numero);
            
            System.out.println("  ");
        
        }
        
        for(i = 0; i < vector.length; i++){
            
            minimo = vector[0];
            
            if (vector[0] > vector[i]){
                
                minimo = vector[i];
            
            }
            
            
        
        }System.out.println("Minimo: " + i);
        
    
    }
    
}
