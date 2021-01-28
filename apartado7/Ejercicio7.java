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
public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] num = new int [100];
    int contador = 0;
    while(contador < 99){
      num[contador] = (int)(Math.random()*20 + 1);
      System.out.print(num[contador] + " ");
      contador++;
    }
    System.out.println("");
    System.out.print("Introduzca el valor que quieras cambiar: ");
    int valor1 = entrada.nextInt();
    System.out.print("Ahora introduzca el valor por el que lo quieras cambiar: ");
    int valor2 = entrada.nextInt();
    contador = 0;
    while(contador < 99){
      if(valor1 == num[contador]){
        num[contador] = valor2;
        System.out.print("'" + num[contador] + "' ");
      }
      else{
        System.out.print(num[contador] + " ");
      }
      contador++;
    }
  }
}
