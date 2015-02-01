/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;

/**
 *
 * @author Marc
 */
public class array_exe6 {
    
    public static void main(String[] args){
        
        int i;
        
        int j;
        
        int [] [] diagonal = new int [5] [5];
        
        for (i = 0; i < diagonal.length; i++) {

            for (j = 0; j < diagonal.length; j++) {

                if (j == i) {

                    System.out.print("1");

                } else if (j != i) {

                    System.out.print("0");

                }

            }
            System.out.println(" ");

        }
    
    
    }
    
}
