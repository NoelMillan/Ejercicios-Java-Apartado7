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
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] num = new int [100];
    int respuesta = 0;
    int contador = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    while(contador < 100){
      num[contador] = (int)(Math.random()*501);
      System.out.print(num[contador] + " ");
      contador++;
    }
    System.out.println("");
    contador = 0;
    System.out.print("¿Qué quieres destacar? (1 - mínimo, 2 - máximo): ");
    respuesta = entrada.nextInt();
    if(respuesta == 1){
      while(contador < 100){
        if(num[contador] < min){
          min = num[contador];
        }
        contador++;
      }
      contador = 0;
      while(contador < 100){
        if(num[contador] == min){
          System.out.print("**" + num[contador] + "** ");
        }
        else{
          System.out.print(num[contador] + " ");
        }
        contador++;
      }
    }
    if(respuesta == 2){
      while(contador < 100){
        if(num[contador] > max){
          max = num[contador];
        }
        contador++;
      }
      contador = 0;
      while(contador < 100){
        if(num[contador] == max){
          System.out.print("**" + num[contador] + "** ");
        }
        else{
          System.out.print(num[contador] + " ");
        }
        contador++;
      }
    }
  }
}