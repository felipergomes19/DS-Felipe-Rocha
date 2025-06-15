/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int Maior_Numero = Integer.MIN_VALUE; // Menor valor possível para um int
        int Menor_Numero = Integer.MAX_VALUE;
        int[] Numeros = new int[10];
        Scanner Entrada = new Scanner(System.in);
        for(int i = 0; i < Numeros.length; i++)
        {
            System.out.println("Insira o numero:");
            int Numero = Entrada.nextInt();
           if(Numero > Maior_Numero)
            {
                Maior_Numero = Numero;
            }
           else
           {
          
               
               if(Numero < Menor_Numero)
               {
                   Menor_Numero = Numero;
               }
           }
        }
        System.out.println("O maior numero inserido foi:"+Maior_Numero);
        System.out.println("O menor numero inserido foi:"+Menor_Numero);
    }
}
