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
public class array_exe8 {

    public static void main(String[] args) {

        int i;

        int j;

        int[][] marco = new int[5][15];

        for (i = 0; i < marco.length; i++) {

            if (i == 0 || i == 4) {
                for (j = 0; j < marco[i].length; j++) {
                    System.out.print("1");
                }
            } else {
                for (j = 0; j < marco[i].length; j++) {
                    if (j == 0 || j == 14) {

                        System.out.print("1");

                    } else {
                        System.out.print("0");

                    }
                }
            }

            System.out.println(" ");
        }

    }

}
