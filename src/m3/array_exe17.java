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
public class array_exe17 {

    public static void main(String[] args) {

        int i;
        int j = 0;
        int m = 0;

        int suma = 0;

        int cantidad = 0;

        int media;

        int n;

        int[] may = new int[5];
        int[] men = new int[5];
        int[] v = new int[5];

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < v.length; i++) {

            n = teclado.nextInt();

            v[i] = n;

            suma = suma + n;

            cantidad = cantidad + 1;

        }

        media = suma / cantidad;

        for (i = 0; i < v.length; i++) {

            if (v[i] >= media) {

                may[j] = v[i];

                j++;
            }
            if (v[i] < media) {

                men[m] = v[i];

                m++;
            }

        }
        System.out.println("Vector may");
        for (j = 0; j < may.length; j++) {
            
           System.out.println("mayor de la media" + may[j]); 

        }
        System.out.println("Vector men");

        for (m = 0; m < men.length; m++) {
            System.out.println("menor de la media" + men[m]);

        }

    }

}
