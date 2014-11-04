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
public class semana_if_else {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int n;

        System.out.println("introducir número");

        n = entrada.nextInt();
        
        if (n == 1){
            
             System.out.print("Dia de la setmana: Dilluns");
         
        } else if (n == 2){
            
             System.out.print("Dia de la setmana: Dimarts");
         
        }else if (n == 3){
            
             System.out.print("Dia de la setmana: Dimecres");
        
        }else if (n == 4){
            
             System.out.print("Dia de la setmana: Dijous");
        
        }else if (n == 5){
            
             System.out.print("Dia de la setmana: Divendres");
        
        }else if (n == 6){
            
             System.out.print("Dia de la setmana: Dissabte");
        
        }else if (n == 7){
            
             System.out.print("Dia de la setmana: Diumenge");
        
        }
    
    }
    
}
