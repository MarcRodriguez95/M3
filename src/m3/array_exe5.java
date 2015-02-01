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
public class array_exe5 {

    public static void main(String[] args) {

        int i;

        int j;

        int[][] tabla = new int[10][10];

        for (i = 1; i <= tabla.length; i++) {

            for (j = 1; j <= tabla.length; j++) {

                if (j % 2 == 0) {

                    System.out.print("1");

                } else if (j % 2 != 0) {

                    System.out.print("0");

                }

            }
            System.out.println(" ");

        }

    }

}
