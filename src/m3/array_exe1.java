/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;

/**
 *
 * @author Marc
 */
public class array_exe1 {

    public static void main(String[] args) {
        int r;

        int cuadrado;
        int natural;
        int cubo;

        int[] numeros = {-55, 92, -37, 90, -120, 34, 73, -44, -66, 24};

        for (r = 0; r < numeros.length; r++) {

            natural = numeros[r];

            cuadrado = natural * natural;

            cubo = natural * natural * natural;

            System.out.println("Natural= " + natural);
            System.out.println("Cuadrado= " + cuadrado);
            System.out.println("Cubo= " + cubo);
            System.out.println();
        }
    }

}
