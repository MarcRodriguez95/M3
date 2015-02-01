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
public class ejemplo_array {

    public static void main(String[] args) {

        int r;

        int[] a = {10, 20, 30, 40, 50};
        int[] b = {50, 60, 70, 80, 100};
        int[] c = new int[5];

        for (r = 0; r < c.length; r++) {

            c[r] = a[r] + b[r];

            System.out.println(c[r]);
        }

    }

}
