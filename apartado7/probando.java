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
public class probando {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
      int [] num = new int[4];
      num[0] = 26;
      num[1] = -30;
      num[2] = 0;
      num[3] = 100;
      System.out.println("El array num contiene los siguientes elementos:");
      int contador = 0;
      while(contador < 4){
        System.out.print(num[contador] + " ");
        contador++;
      }
  }
}
