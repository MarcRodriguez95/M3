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
public class array_exe4 {

    public static void main(String[] args) {

        int i;

        int[] origen = {1, 4, 10, 32, 60, 91, 34, 56, 73, 88, 86};

        int[] destino = new int[11];

        System.out.println("origen");

        for (i = 0; i < origen.length; i++) {

            System.out.print(origen[i] + "   ");

        }
        System.out.println("  ");

        System.out.println("Destino");

        for (i = 0; i < origen.length; i++) {

            if (origen[i] > 25 && origen[i] % 2 == 0) {
                
                destino[i] = origen[i];

                System.out.print("Posicion " + i + ",  ");

                System.out.print("numero " + destino[i] + ";   ");

            }
        }

    }
}
