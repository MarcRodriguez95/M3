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
public class exe16_media_numeros {

    public static void main(String[] args) {

        Scanner ordenador = new Scanner(System.in);

        int i;

        int minimo = 5;

        int maximo = 5;

        int media;

        int cantidad = 0;

        int suma = 0;

        System.out.println("Introduce numeros");

        i = ordenador.nextInt();

        while (i >= 0) {

            if (i > maximo) {
                maximo = i;

            }
            if (i < minimo) {
                minimo = i;

            }
            suma = suma + i;
            i = ordenador.nextInt();
            cantidad = cantidad + 1;
        }

        media = suma / cantidad;

        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
        System.out.println("La media es: " + media);

    }

}
