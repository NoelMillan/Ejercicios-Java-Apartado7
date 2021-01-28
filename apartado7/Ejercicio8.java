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
public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] num = new int [13];
    int contador = 1;
    int contador2 = 0;
    String mes = "";
    while(contador <= 12){
      switch (contador){
        case 1:
          mes = "Enero";
          break;
        case 2:
          mes = "Febrero";
          break;
        case 3:
          mes = "Marzo";
          break;
        case 4:
          mes = "Abril";
          break;
        case 5:
          mes = "Mayo";
          break;
        case 6:
          mes = "Junio";
          break;
        case 7:
          mes = "Julio";
          break;
        case 8:
          mes = "Agosto";
          break;
        case 9:
          mes = "Septiembre";
          break;
        case 10:
          mes = "Octubre";
          break;
        case 11:
          mes = "Noviembre";
          break;
        case 12:
          mes = "Diciembre";
          break;
      }
      System.out.print("Introduzca la temperatura media que ha hecho en " + mes + ": ");
      num[contador] = entrada.nextInt();
      contador++;
    }
    contador = 1;
    while(contador <= 12){
            switch (contador){
        case 1:
          mes = "Enero:\t\t";
          break;
        case 2:
          mes = "Febrero:\t";
          break;
        case 3:
          mes = "Marzo:\t\t";
          break;
        case 4:
          mes = "Abril:\t\t";
          break;
        case 5:
          mes = "Mayo:\t\t";
          break;
        case 6:
          mes = "Junio:\t\t";
          break;
        case 7:
          mes = "Julio:\t\t";
          break;
        case 8:
          mes = "Agosto:\t\t";
          break;
        case 9:
          mes = "Septiembre:\t";
          break;
        case 10:
          mes = "Octubre:\t";
          break;
        case 11:
          mes = "Noviembre:\t";
          break;
        case 12:
          mes = "Diciembre:\t";
          break;
      }
      System.out.print(mes);
      while(contador2 < num[contador]){
        System.out.print("-");
        contador2++;
      }
      System.out.println("");
      contador2 = 0;
      contador++;
    }
  }
}
