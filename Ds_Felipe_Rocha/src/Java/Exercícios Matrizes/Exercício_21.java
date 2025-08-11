/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Exercício_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[30];

        System.out.println("Digite 30 números inteiros:");
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            Numeros[i] = Entrada.nextInt();
        }

        quickSort(Numeros, 0, Numeros.length - 1);

        System.out.println("\nVetor ordenado com Quick Sort:");
        for (int num : Numeros) {
            System.out.print(num + " ");
        }

        Entrada.close();
    }

    // Método Quick Sort
    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, pivoIndex - 1);
            quickSort(vetor, pivoIndex + 1, fim);
        }
    }

    
    public static int particionar(int[] Numeros, int inicio, int fim) {
        int pivo = Numeros[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (Numeros[j] <= pivo) {
                i++;
                int temp = Numeros[i];
                Numeros[i] = Numeros[j];
                Numeros[j] = temp;
            }
        }

        int temp = Numeros[i + 1];
        Numeros[i + 1] = Numeros[fim];
        Numeros[fim] = temp;

        return i + 1;
    }
}
