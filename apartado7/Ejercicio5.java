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
public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int contador = 0;
    int menor = 9999;
    int mayor = -9999;
    int [] num = new int [10];
    while(contador < 10){
      System.out.print("Introduzca un número: ");
      num[contador] = entrada.nextInt();
      if(num[contador] < mayor){
        mayor = num[contador];
      }
      if(num[contador] > menor){
        menor = num[contador];
      }
      contador++;
    }
    contador = 0;
    while(contador < 10 ){
      System.out.print(num[contador]);
      if(num[contador] == mayor){
        System.out.print(" - máximo");
      }
      if(num[contador] == menor){
        System.out.print(" - mínimo");
      }
      System.out.println("");
      contador++;
    }
  }
}
