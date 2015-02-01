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
public class array_exe16 {

    public static void main(String[] args) {

        int j;
        int l = 0;
        int m = 0;

        int n;

        int[] i = new int[5];
        int[] p = new int[5];
        int[] v = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (j = 0; j < v.length; j++) {

            n = teclado.nextInt();

            v[j] = n;
            if (j % 2 == 0) {

                p[l] = n;

                l++;

            } else if (j % 2 != 0) {

                i[m] = n;

                m++;

            }

        }

        for (l = 0; l < p.length; l++) {

            System.out.println("vector p (índice par): " + p[l]);

        }

        for (m = 0; m < i.length; m++) {

            System.out.println("vector i (índice impar): " + i[m]);

        }

    }

}
