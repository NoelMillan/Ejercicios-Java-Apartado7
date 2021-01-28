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
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] mesa = new int [10];
    int contador = 0;
    int ocupa = 0;
    boolean pregunta = false;
    boolean incognita = false;
    while(contador < 10){
      mesa[contador] = (int)(Math.random()*5);
      contador++;
    }
    contador = 1;
    System.out.print("Mesa nº:\t");
    while(contador < 11){
      System.out.print(contador + " ");
      contador++;
    }
    contador = 0;
    System.out.println("");
    System.out.print("Ocupación:\t");
    while(contador < 10){
      System.out.print(mesa[contador] + " ");
      contador++;
    }
    contador = 0;
    int contador2 = 0;
    System.out.println("");
    while(ocupa != -1){
      pregunta = false;
      incognita = false;
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      ocupa = entrada.nextInt();
      while(contador < 10 && pregunta == false){
        while(contador2 < 10 && pregunta == false){
          if(mesa[contador2] == 0 && mesa[contador] + ocupa < 5){
            mesa[contador2] = mesa[contador2] + ocupa;
            pregunta = true;
            incognita = true;
          }
          contador2++;
        }
        if((mesa[contador] + ocupa) < 5 && incognita == false){
          mesa[contador] = mesa[contador] + ocupa;
          pregunta = true;
        }
        else{
          System.out.print("");
        }
        contador2 = 0;
        contador++;
      }
      contador = 1;
      System.out.print("Mesa nº:\t");
      while(contador < 11){
        System.out.print(contador + " ");
        contador++;
      }
      contador = 0;
      System.out.println("");
      System.out.print("Ocupación:\t");
      while(contador < 10){
        System.out.print(mesa[contador] + " ");
        contador++;
      }
      System.out.println("");
      contador = 0;
    }
    System.out.println("");
    System.out.println("Gracias. Hasta Pronto");
    System.out.println("");
  }
}