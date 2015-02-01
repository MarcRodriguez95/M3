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
public class array_exe12 {

    public static void main(String[] args) {
        
        int i;
        
     
        
        Scanner teclado = new Scanner(System.in);

        int[] v = new int[5];
        
        int[] w = new int[5];
        
        System.out.println("Introduce los numeros");
        
        for(i = 0; i < v.length; i++){
            
            v[i] = teclado.nextInt();
            
        
        }
        System.out.println("Los numeros en orden inverso");
        
        for(i = v.length - 1; i >= 0; i--){
            
            w[i] = v[i] ;
            
            System.out.print("  " + w[i]);
        
        }
    }
}
