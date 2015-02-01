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
public class Vocal_consonante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i;
        
        String numero;

        String letra;

        String consonante = ("Es consonante");

        String vocal = ("Es vocal");

        System.out.println("Ingrese letra");
        letra = teclado.nextLine();

        for (i = 0; i < letra.length(); i++) {

        }
        for (i = 0; i < letra.length(); i++) {
            if ((letra.charAt(i) == 'a') || (letra.charAt(i) == 'e') || (letra.charAt(i) == 'i') || (letra.charAt(i) == 'o') || (letra.charAt(i) == 'u')) {

                System.out.println(vocal);

            } else if ((letra.charAt(i) != 'a') || (letra.charAt(i) != 'e') || (letra.charAt(i) != 'i') || (letra.charAt(i) != 'o') || (letra.charAt(i) != 'u')){

                System.out.println(consonante);
            } else if (letra != vocal || letra != consonante){
                
                System.out.println("Error");
            
            }
        }

    }

}
