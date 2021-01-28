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
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] num = new int [10];
    int [] primo = new int [10];
    int primos = 0;
    int [] noprimo = new int [10];
    int noprimos = 0;
    int contador = 0;
    int contador2 = 2;
    boolean primoo = false;
    while(contador < 10){
      System.out.print("Introduzca un número: ");
      num[contador] = entrada.nextInt();
      contador++;
    }
    contador = 0;
    while(contador < 10){
      System.out.print(num[contador] + " ");
      contador++;
    }
    System.out.println("");
    contador = 0;
    while(contador < 10){
      primoo = true;
      while(contador2 < num[contador]){
        if(num[contador] % contador2 == 0){
          primoo = false;
        }
        contador2++;
      }
      if(primoo){
        primo[primos] = num[contador];
        primos++;
      }
      else{
        noprimo[noprimos] = num[contador];
        noprimos++;
      }
      contador2 = 2;
      contador++;
    }
    primos = 0;
    noprimos = 0;
    contador = 0;
    while(contador < primos){
      System.out.print(primo[primos] + " ");
      contador++;
    }
    contador = 0;
    while(contador < noprimos){
      System.out.print(noprimo[noprimos] + " ");
      contador++;
    }
  }
}