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
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] num = new int [10];
    int contador = 0;
    int inicial = 0;
    int inicial2 = 0;
    int finall = 0;
    int finall2 = 0;
    int cuenta = 0;
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
    contador = 0;
    System.out.println("");
    System.out.print("Introduzca el número de la posición inicial: ");
    inicial = entrada.nextInt();
    inicial2 = inicial - 1;
    System.out.print("Introduzca el número de la posición final: ");
    finall = entrada.nextInt();
    finall2 = finall - 1;
    if(inicial < finall){
      System.out.print(num[9] + " ");
      contador = 0;
      while(contador <= inicial2){
        System.out.print(num[contador] + " ");
        contador++;
      }
      while(contador < finall2){
        System.out.print(num[contador + 1] + " ");
        contador++;
      }
      System.out.print(num[inicial2 + 1] + " ");
      while(contador < 8){
        System.out.print(num[contador + 1] + " ");
        contador++;
      }
    }
    else{
      System.out.println("El número de la posición inicial debe ser menor que el de la posición final");
    }
  }
}