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
public class exe18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 2;

        int n;

        int j;

        int total = 1;

        System.out.print("Introduzca el exponente del numero 2 que desee: ");

        n = teclado.nextInt();

        for (j = 1; j <= n; j++) {

            if (n > 0) {

                total = total * i;
            }
            System.out.println(total);
        }

    }

}
