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
public class triangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int filas;

        int i;

        int j;

        System.out.println("Inserta numero de filas");

        filas = teclado.nextInt();

        for (i = 0; i < filas; i++) {

            for (j = 0; j < i; j++) {

                System.out.print("*");

            }
            System.out.println("*");

        }

    }

}
