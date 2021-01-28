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
public class Ejercicio2 {
  public static void main(String[] args) {
    String [] caracter = new String[10];
    caracter [0] = "a";
    caracter [1] = "x";
    caracter [4] = "'@'";
    caracter [6] = " ";
    caracter [7] = "+";
    caracter [8] = "Q";
    int contador = 0;
    while(contador < 10){
      System.out.print(caracter[contador] + " ");
      contador++;
    }
  }
}
