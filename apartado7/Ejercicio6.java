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
public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int contador = 0;
    int [] num = new int [15];
    while(contador < 15){
      System.out.print("Introduzca un número: ");
      num[contador] = entrada.nextInt();
      contador++;
    }
    contador = 1;
    System.out.println(num[14]);
    while(contador < 14){
      System.out.println(num[contador]);
      contador++;
    }
  }
}
