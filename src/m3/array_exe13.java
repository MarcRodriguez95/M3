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
public class array_exe13 {

    public static void main(String[] args) {
        
        int i;

        int[] v = new int[5];

        int[] w = new int[5];
        
        int[] x = new int[5];
        
        Random num = new Random();
        
        System.out.println("Numeros de la matriz v: ");
        
        for(i = 0; i < v.length; i++){
            
            v[i] = num.nextInt(9);
        System.out.print("  " + v[i]);
        }
        
        System.out.println("");
        System.out.println("Numeros de la matriz w: ");
        
        for(i = 0; i < w.length; i++){
            
            w[i] = num.nextInt(9);
        System.out.print("  " + w[i]);
        }
        
        System.out.println("");
        System.out.println("Numeros de la matriz x: ");
        
        for(i = 0; i < x.length; i++){
            
            x[i] = v[i] + w[i];
        
        System.out.print(" " + x[i]);
        }
        
        
    }
}
