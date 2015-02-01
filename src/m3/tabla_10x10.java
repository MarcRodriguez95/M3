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
public class tabla_10x10 {

    public static void main(String[] args) {

        int numero = 0;

        int i;

        int producto = 0;

        System.out.println("Las tablas de multiplicar");

        for (numero = 0; numero <= 10; numero++) {

            for (i = 0; i <= 10; i++) {

                producto = i * numero;
                System.out.println(numero + "*" + i + "=" + producto);
            }
            System.out.println();
        }

    }

}
