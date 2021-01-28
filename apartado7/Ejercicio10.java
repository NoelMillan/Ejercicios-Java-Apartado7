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
public class Ejercicio10 {
  public static void main(String[] args) {
    int [] num = new int [20];
    int [] par = new int [20];
    int [] impar = new int [20];
    int cuentapares = 0;
    int cuentaimpares = 0;
    int contador = 0;
    while(contador < 20){
      num[contador] = (int)(Math.random()*101);
      contador++;
    }
    contador = 0;
    while(contador < 20){
      if(num[contador] % 2 == 0){
        par[cuentapares] = num[contador];
        cuentapares++;
      }
      else{
        impar[cuentaimpares] = num[contador];
        cuentaimpares++;
      }
      contador++;
    }
    for(int n : num){
      System.out.print(n + " ");
    }
    System.out.println("");
    for(int p : par){
      System.out.print(p + " ");
    }
    System.out.println("");
    for(int i : impar){
      System.out.print(i + " ");
    }
  }
}