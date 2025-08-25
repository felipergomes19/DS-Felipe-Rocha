/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercício_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        
        System.out.println("Insira os numeros no vetor:");
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        Arrays.sort(Numeros);
        
        double Mediana;
        int Meio1 = Numeros.length/2 - 1;
        int Meio2 = Numeros.length/2;
        Mediana = (Numeros[Meio1] + Numeros[Meio2])/2;
        
        System.out.print("Vetor ordenado:");
        for(int num : Numeros)
        {
            System.out.print(num+" ");
        }
        System.out.println("\nA mediana desse vetor e o numero: "+Mediana);
    }
}
