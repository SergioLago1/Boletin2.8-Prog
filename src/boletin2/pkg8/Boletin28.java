/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg8;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float grados;
       float kelvin;
       float farenheint;
       Scanner obx=new Scanner(System.in);
       System.out.print("Introducir grados :");
       grados=obx.nextFloat();
       kelvin = grados + 273;
       farenheint = 32+1.8f*grados;
       System.out.print("Grados kelvin = "+kelvin);
       System.out.print("Grados Farenheint = "+farenheint);
    }
}
