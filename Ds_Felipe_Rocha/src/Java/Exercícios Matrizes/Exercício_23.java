/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_23 {

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
        
        int Ultimo_Numero = Numeros[Numeros.length-1];
        for(int i = Numeros.length - 1; i > 0;i--)
        {
            Numeros[i] = Numeros[i-1];
        }
        Numeros[0] = Ultimo_Numero;
        
        System.out.println("Vetor apos a rotacao para a direita:");
        for(int num : Numeros)
        {
            System.out.print(num+" ");
        }
    }
}
