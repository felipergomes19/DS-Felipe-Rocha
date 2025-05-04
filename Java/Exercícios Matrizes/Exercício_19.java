/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
import java.util.LinkedHashSet;
public class Exercício_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[20];
        System.out.print("Insira os numeros no vetor:");

        for(int i  = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }

        LinkedHashSet<Integer> Unicos = new LinkedHashSet<>();
        for(int num : Numeros)
        {
            Unicos.add(num);
        }

        System.out.println("\nVetor sem elementos duplicados:");
        for (int num : Unicos) {
            System.out.print(num + " ");
        }

        Entrada.close();
    }
}
