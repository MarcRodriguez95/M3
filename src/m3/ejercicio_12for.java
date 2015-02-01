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
public class ejercicio_12for {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i;

        int numeros;

        int suma = 0;

        System.out.println("Introduce los numeros");

        for (numeros = 0; numeros < 5; numeros++) {

            i = teclado.nextInt();

            if (i % 2 == 0) {

                suma = i + suma;
            }
        }
        System.out.println("La suma es : " + suma);

    }

}
