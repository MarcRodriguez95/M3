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
public class array_exe15 {

    public static void main(String[] args) {

        int i;
        int j;
        int k;
        int l = 0;
        int q = 0;

        int n;
        int m;

        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[10];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los numeros del vector v");

        for (i = 0; i < v.length; i++) {

            n = teclado.nextInt();

            v[i] = n;

        }
        System.out.println("Introduce los numeros del vector w");

        for (j = 0; j < w.length; j++) {

            m = teclado.nextInt();

            w[j] = m;

        }
        System.out.println("Se muestra el vector x(x = v+w mezclados)");
        for (k = 0; k < x.length; k++) {

            if (k % 2 == 0) {

                x[k] = v[l];
                l++;

            } else if (k % 2 != 0) {

                x[k] = w[q];
                q++;

            }

        }
        
        for (l = 0; l < v.length; l++) {
            System.out.println("vector v: " + v[l]);
            System.out.println("");

        }

        for (q = 0; q < w.length; q++) {

            System.out.println("vector w: " + w[q]);
            System.out.println("");
        }
        System.out.println("Se muestra el vector x(x = v+w mezclados)");
        
        System.out.println("Mostrar el vector v");
        
        for (k = 0; k < x.length; k++) {

            System.out.println("vector x: " + x[k]);
            System.out.println("");
        }

    }

}
