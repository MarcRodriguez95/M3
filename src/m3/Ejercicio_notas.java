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
public class Ejercicio_notas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introducir nota");

        double n;

        char acta;

        n = entrada.nextDouble();

        String fin = ("Tu nota és: ");

        if (n >= 9.75 && n <= 10.0) {

            acta = 'M';

            System.out.print(fin + acta);

        } else if (n >= 8.5 && n < 9.75) {

            acta = 'E';

            System.out.println(fin + acta);

        } else if (n >= 6.5 && n < 8.5) {

            acta = 'N';

            System.out.println(fin + acta);

        } else if (n >= 5.0 && n < 6.5) {

            acta = 'A';

            System.out.println(fin + acta);

        } else if (n >= 0.0 && n < 5.0) {

            acta = 'S';

            System.out.println(fin + acta);

        }

    }

}
