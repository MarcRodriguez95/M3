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
public class array_exe14 {

    public static void main(String[] args) {

        int i;
        int n;
        int[] enteros = new int[10];

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los numeros");

        for (i = 0; i < enteros.length; i++) {

            n = teclado.nextInt();

            if (n >= 0) {
                enteros[i] = n;

            } else {

                break;

            }
            
            System.out.println(" ");

        }
        for (i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i]);
            System.out.print("  ");
        }

    }

}
