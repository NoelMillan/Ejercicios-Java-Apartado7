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
public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int contador = 0;
    int [] num = new int [8];
    while(contador < 8){
      System.out.print("Introduzca un número entero: ");
      num[contador] = entrada.nextInt();
      contador++;
    }
    contador = 0;
    while(contador < 8){
      if((num[contador] % 2) == 0){
        System.out.println(num[contador] + " - par");
      }
      else{
        System.out.println(num[contador] + " - impar");
      }
      contador++;
    }
  }
}
