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
public class notas_switch {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int nota;
        
        char acta;
        
        System.out.println("Introdueix la nota");
        
        nota = teclado.nextInt();
        
        switch (nota){
            
            case 1:
                System.out.println("acta = S");
                break;
            case 2:
                System.out.println("acta = S");
                break;
            case 3: 
                System.out.println("acta = S");
                break;
            case 4:
                System.out.println("acta = S");
                break;
            case 5:
                System.out.println("acta = A");
                break;
            case 6:
                System.out.println("acta = A");
                break;
            case 7:
                System.out.println("acta = N");
                break;
            case 8:
                System.out.println("acta = N");
                break;
            case 9:
                System.out.println("acta = E");
                break;
            case 10:
                System.out.println("acta = M");
                break;
        
        
        }
    
    
    }
    
}
