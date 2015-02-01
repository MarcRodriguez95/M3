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
public class arrray_exe9 {

    public static void main(String[] args) {

        int[] vector = new int[10];

        int i;

        int suma = 0;

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < vector.length; i++) {

            System.out.println("numero" );

            vector[i] = teclado.nextInt();

        }
        
        System.out.println("SUMAS");

        for (i = 0; i < vector.length; i++) {
            
           

            if (i == 0) {

                suma = suma + vector[i];

                System.out.print("  " + suma);
            } else if (i != 0) {

                suma = vector[i - 1] + vector[i];

                System.out.print("  "+ suma);

            }
            System.out.println(" ");

        }

    }
}
