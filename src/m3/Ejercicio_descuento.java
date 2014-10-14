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
public class Ejercicio_descuento {

    public static final float DESCOMPTE = 8;
    public static final float COMPRA_MIN = 100;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quin es el preu del producte, en euros?");

        float preu = teclado.nextFloat();
        teclado.nextLine();
        //numero en el proximo párrafo

        if (preu > COMPRA_MIN) {
            float descompteFet = preu * DESCOMPTE / 100;
            preu = preu - descompteFet;
        }

        System.out.println("El preu final per pagar és de " + preu + " euros.");


    }
}
