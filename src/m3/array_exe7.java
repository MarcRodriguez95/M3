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
public class array_exe7 {

    public static void main(String[] args) {

        int i;

        int j;
        
        int numero;

        int suma_i = 0;
        
        int suma_j = 0;

        int[][] matriz = new int[10][10];

        Random num = new Random();
        
        for (i = 0; i < matriz.length; i++){
            
                     
            
        
            for (j = 0; j < matriz[i].length; j++){
                
                numero = num.nextInt(10);
                
                System.out.print(j);
                
                
                matriz [i][j] = numero;
            
               
            }
       
            System.out.println(i);
            
        
        }

    }

}
