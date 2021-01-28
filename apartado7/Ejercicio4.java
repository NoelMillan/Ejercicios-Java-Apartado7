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
public class Ejercicio4 {
  public static void main(String[] args) {
    int [] numero = new int [20];
    int [] numero2 = new int [20];
    int [] numero3 = new int [20];
    int contador = 0;
    int num = 0;
    int cuadrado = 0;
    int cubo = 0;
    while(contador < 20){
      num = (int)(Math.random()*100 + 1);
      cuadrado = num * num;
      cubo = num * num * num;
      numero[contador] = num;
      numero2[contador] = cuadrado;
      numero3[contador] = cubo;
      System.out.println(numero[contador] + "\t" + numero2[contador] + "\t" + numero3[contador]);
      contador++;
    }
  }
}
