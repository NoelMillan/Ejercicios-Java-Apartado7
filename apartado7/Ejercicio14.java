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
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String [] palabra = new String [8];
    String [] color = new String [8];
    int contador = 0;
    boolean escolor = true;
    while(contador < 8){
      System.out.print("Introduzca una palabra: ");
      palabra[contador] = entrada.next();
      contador++;
    }
    contador = 0;
    while(contador < 8){
      System.out.print(palabra[contador] + " ");
      contador++;
    }
    contador = 0;
    int contador2 = 0;
    while(contador2 < 8){
      switch(contador2){
        case 0:
          color[contador2] = "verde";
          break;
        case 1:
          color[contador2] = "rojo";
          break;
        case 2:
          color[contador2] = "azul";
          break;
        case 3:
          color[contador2] = "amarillo";
          break;
        case 4:
          color[contador2] = "naranja";
          break;
        case 5:
          color[contador2] = "rosa";
          break;
        case 6:
          color[contador2] = "negro";
          break;
        case 7:
          color[contador2] = "blanco";
          break;
      }
      contador2++;
    }
    System.out.println("");
    contador2 = 0;
    while(contador < 8){
      while(contador2 < 8){
        if(palabra[contador].equals(color[contador2])){
          System.out.print(palabra[contador] + " ");
        }
        contador2++;
      }
      contador2 = 0;
      contador++;
    }
    contador = 0;
    contador2 = 0;
    while(contador < 8){
      escolor = true;
      while(contador2 < 8){
        if(palabra[contador].equals(color[contador2])){
          escolor = false;
        }
        contador2++;
      }
      if(escolor){
        System.out.print(palabra[contador] + " ");
      }
      contador2 = 0;
      contador++;
    }
  }
}