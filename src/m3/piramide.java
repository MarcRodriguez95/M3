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
public class piramide {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int filas;

        int i;

        int j;

        int k;

        System.out.println("Introduce las filas");

        filas = entrada.nextInt();

        
        for (i = 0; i < filas; i++) {

            for (j = 0; j < filas - i; j++) {
                System.out.print("  ");
                //espacios en blanco//
            }
            for (k = 0; k < 2*i + 1; k--) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}
