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



public class Ejercicio_número {
    public static int N = 4;
    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);
        
        double n;
        
        String mensaje;
        
        System.out.println("Empezar juego");
        //salto de linia(println).
        
       
        System.out.print("Introducir un numero");
        n=entrada.nextInt();
        if (N == n){
            mensaje = "Correcto";
          
        }else{
            mensaje="Incorrecto";
        }
        
        System.out.println(mensaje);
        
        
        
        
    }    
    
}
