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
public class array_exe3 {

    public static void main(String[] args) {

        int i;

        

        int numero;

        int[] vector = new int[20];

        Random num = new Random();

        for (i = 0; i < vector.length; i++) {

            numero = num.nextInt(101);

            vector[i] = numero;

            if (numero > 30) {
                System.out.println("Posición: " + i);

                System.out.println(vector[i]);

            } else if (vector[i] < 30) {
                
                System.out.println("Posición: " + i);

                System.out.println("No hay numeros mayores de 30");

            }

        } 
    }
}
