/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author Marc
 */
public class array_exe2 {

    public static void main(String[] args) {

        int i;

        int j = 0;

        int N = 0;

        int numero;

        int suma = 0;

        int[] vector = new int[15];

        Random num = new Random();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Suma de los primeros N numeros");

        N = teclado.nextInt();

        for (i = 0; i < vector.length; i++) {

            numero = num.nextInt(101);

            vector[i] = numero;

            if (j < N) {

                suma = vector[i] + suma;

                j++;

            }

            System.out.println("Numeros aleatorios del array" + vector[i]);
        }
        System.out.println("Suma de los N primeros numeros" + suma);

    }
}
