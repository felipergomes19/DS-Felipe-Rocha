/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         Scanner Entrada = new Scanner (System.in);
         System.out.println("Digite um numero:");
         int numero = Entrada.nextInt();
         
         for(int i = 0; i <= numero ; i++)
         {
             System.out.println("O seu numero e:"+i);
             
         }
        // TODO code application logic here
    }
}
