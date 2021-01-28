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
public class Ejercicio1 {
  public static void main(String[] args) {
    int [] num = new int[12];
    num [0] = 39;
    num [1] = -2;
    num [4] = 0;
    num [6] = 14;
    num [8] = 5;
    num [9] = 120;
    int contador = 0;
    while(contador < 12){
      System.out.print(num[contador] + " ");
      contador++;
    }
  }
}
