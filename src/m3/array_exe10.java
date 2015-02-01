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
public class array_exe10 {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        int i;

        int suma = 0;
  

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < numeros.length; i++) {

            System.out.println("numero");

            numeros[i] = teclado.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {

            if (i <= numeros.length) {

                suma = suma + numeros[i];

            } 
            System.out.println(suma);
        }
     

    }

}
