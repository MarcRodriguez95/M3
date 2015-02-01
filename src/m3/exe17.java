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
public class exe17 {

    public static void main(String[] args) {

        Scanner ordenador = new Scanner(System.in);

        int i;

        int positivo = 0;

        int negativo = 0;

        System.out.println("Introduce numero mayor de 0 ");

        i = ordenador.nextInt();

        while (i != 0) {
            

            if (i > 0) {
                positivo = positivo + 1;

            }else if (i < 0){
                
                negativo = negativo + 1;
            }i = ordenador.nextInt();

        }
        
        System.out.println("numeros positivos: " + positivo);
        System.out.println("numeros negativos: " + negativo);

    }

}
