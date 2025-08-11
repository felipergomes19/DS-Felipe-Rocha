/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Exercício_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];

        System.out.println("Digite 30 números inteiros:");
        for (int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }

       
        int MaxInicio = 0;
        int MaxTamanho = 1;

        int AtualInicio = 0;
        int AtualTamanho = 1;

        for (int i = 1; i < Numeros.length; i++) 
        {
            if (Numeros[i] > Numeros[i - 1]) 
            {
                AtualTamanho++;
            } 
            else 
            {
                if (AtualTamanho > MaxTamanho) 
                {
                    MaxTamanho = AtualTamanho;
                    MaxInicio = AtualInicio;
                }
                AtualInicio = i;
                AtualTamanho = 1;
            }
        }

        if (AtualTamanho > MaxTamanho) {
            MaxTamanho = AtualTamanho;
            MaxInicio = AtualInicio;
        }

        System.out.println("\nMaior subsequência crescente contínua:");
        for (int i = MaxInicio; i < MaxInicio + MaxTamanho; i++) {
            System.out.print(Numeros[i] + " ");
        }

        Entrada.close();
    }
}
