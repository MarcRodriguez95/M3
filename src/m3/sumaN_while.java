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
public class sumaN_while {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 0;

        int n;

        int j = 0;

        int suma = 0;

        System.out.println("Introduce el numero máximo");
        
        n = teclado.nextInt();
        
        while (i <= n) {

            if (j <= n) {
                suma = j + suma;
                j = j + 1;
            }

            i = i + 1;
        }
        System.out.println("La suma total es: " + suma);

    }

}
