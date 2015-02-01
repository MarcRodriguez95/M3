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
public class exe11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i = 0;

        int par = 0;
        
         int n ;
         
         System.out.println("Cuantos numeros pares?");
         n = teclado.nextInt();

        while (i < n) {

            par = par + 2;
            System.out.println(par);
            i++;
        }
    }
}
