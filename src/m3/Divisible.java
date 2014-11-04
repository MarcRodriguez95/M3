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
public class Divisible {
    
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Introduce dos numeros");
        
        n1 = entrada.nextInt();
        
        n2 = entrada.nextInt();
        
        if ( n1%n2 == 0){
            System.out.println(n1  + "És divisible por" +  n2);
            
        } else if( n1%n2 != 0){
            System.out.println(n1 +  "No és divisible por"  + n2);
        
        }
        
        
        
    
}
    
}
