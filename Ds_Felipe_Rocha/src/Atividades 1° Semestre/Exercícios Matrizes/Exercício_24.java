/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        
        System.out.println("Insira os numeros no vetor:");
        for(int i  = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        int Maior_Numero = Integer.MIN_VALUE;
        int Segundo_Maior_Numero = Integer.MIN_VALUE;
        
        for (int num : Numeros) {
            if (num > Maior_Numero) {
                Segundo_Maior_Numero = Maior_Numero;
                Maior_Numero = num;
            } else if (num > Segundo_Maior_Numero && num != Maior_Numero) {
                Segundo_Maior_Numero = num;
            }
        }

        // Exibe o segundo maior valor
        if (Segundo_Maior_Numero == Integer.MIN_VALUE) {
            System.out.println("\nNão foi possível encontrar o segundo maior valor (todos os números podem ser iguais).");
        } else {
            System.out.println("\nSegundo maior valor: " + Segundo_Maior_Numero);
        }
    }
}
