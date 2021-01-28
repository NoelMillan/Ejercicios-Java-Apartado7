/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado7;

/**
 *
 * @author noelm
 */
import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] num = new int[10];
    int contador = 0;
    System.out.println("Por favor, introduzca 10 números enteros");
    System.out.println("Pulse la tecla ENTER después de introducir cada número");
    while(contador < 10){
      System.out.print("Introduzca un número: ");
      num[contador] = entrada.nextInt();
      contador++;
    }
    contador = 9;
    while(contador > 0){
      System.out.print(num[contador] + " ");
      contador--;
    }
  }
}
