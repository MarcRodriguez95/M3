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
public class cuadrado {
    
    public static void main (String [] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int fila;
        
        int columna;
        
        int i;
        
        int j;
        
        System.out.println("Introduce el numero de filas");
        
        fila = teclado.nextInt();
        
        System.out.println("Introduce el numero de columnas");
        
        columna = teclado.nextInt();
        
        for (i=0; i<fila; i++){
            
            for (j=0; j<columna; j++){
                System.out.print("*");
            
            }
            
            System.out.println("*");
        }
    
    }
    
}
