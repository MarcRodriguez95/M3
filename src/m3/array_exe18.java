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
public class array_exe18 {

    public static void main(String[] args) {

        int i;

        int salario_mensual;
        
        int salario_anual;
        
        int pagas;
        
        int impuesto;

        int[] numero = new int [1];
        int[] liminf = {1000000};
        int[] limsup = {1};
        int[] pct = new int[1];

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i <= numero.length; i++) {
            System.out.println("Salario mensual");

            salario_mensual = teclado.nextInt();
            
            System.out.println("Numero de pagas al año");
            
            pagas = teclado.nextInt();
            
            numero[i] = salario_mensual;
            
            salario_anual = salario_mensual*pagas;
            
            for (liminf){
                
                
            
            }
            
            
        
        }

    }

}
