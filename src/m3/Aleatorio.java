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
//Aquesta línia fa que la biblioteca estigui disponible.
import java.util.Scanner;
//Un programa que llegeix un enter i el mostra per pantalla.
public class Aleatorio {
public static void main (String[] args) {
//S'inicialitza la biblioteca.
Scanner lector = new Scanner(System.in);
//Es posa un missatge de benvinguda.
System.out.println("Anem a sumar dos nombres enters");
//Es llegeix un valor enter per teclat.
//S'espera que es pitgi la tecla de retorn.
System.out.print("Escriu un nombre i pitja la tecla de retorn: ");
int primerEnter = lector.nextInt();
lector.nextLine();
//Es torna a fer...
System.out.print("Torna a fer-ho: ");
int segonEnter = lector.nextInt();
lector.nextLine();
//Fem l'operació.
int resultat = primerEnter + segonEnter;
//Imprimeix el resultat per pantalla!
//S'usa l'operador suma entre una cadena de text i un enter
System.out.println("La suma dels dos valors és " + resultat + ".");
}
}
