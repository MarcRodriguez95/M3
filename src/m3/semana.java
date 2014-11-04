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
public class semana {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n;

        System.out.println("introducir número");
        


        n = entrada.nextInt();
        
        switch (n){
                
                case 1:
                    System.out.print("Dia de la setmana: Dilluns");
                    break;
                case 2:
                    System.out.print("Dia de la setmana: Dimarts");
                    break;
                case 3:
                    System.out.print("Dia de la setmana: Dimecres");
                    break;
                case 4:
                    System.out.print("Dia de la setmana: Dijous");
                    break;
                case 5:
                    System.out.print("Dia de la setmana: Divendres");
                    break;
                case 6:
                    System.out.print("Dia de la setmana: Dissabte");
                    break;
                case 7:  
                    System.out.print("Dia de la setmana: Diumenge");
                    break;
                    
        }
        
    
    }
    
}
