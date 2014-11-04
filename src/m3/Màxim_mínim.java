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
public class Màxim_mínim {
    public static void main(String [] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        
        String máxim = ("El número máxim és:");
        
        String mínim = ("El número mínim és:");
        
        System.out.println("Escriba tres números");
        
        System.out.println("Primer número");
        n1=teclado.nextInt();
        
        System.out.println("Segundo número");
        n2 =teclado.nextInt();
        
        System.out.println("Tercer número");
        n3=teclado.nextInt();
        
        if (n1 > n3 && n3 > n2){
            System.out.println(máxim + n1);
            System.out.print(mínim + n2);
        
        }else if (n1 > n2 && n2 > n3){
            System.out.println(máxim + n1);
            System.out.print(mínim + n3);
        
        }else if (n3 > n1 && n3 > n2){
            System.out.println(máxim + n3);
            System.out.print(mínim + n2);
        }else if (n2 > n1 && n1 > n3){
            System.out.println(máxim + n2);
            System.out.print(mínim + n3);
        
        }else if (n2 > n3 && n3 > n1){
            System.out.println(máxim + n2);
            System.out.print(mínim + n1);
        }else if (n3 > n2 && n2 > n1){
            System.out.println(máxim + n3);
            System.out.print(mínim + n1);
        }
        
    
    
    }
    
}
