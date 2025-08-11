/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        for(int i = 0; i < Numeros.length; i++)
        {
            System.out.println("Insira 10 numeros:");
            Numeros[i] = Entrada.nextInt();
        }
        for(int j = 0; j < Numeros.length; j++) {
            System.out.println(Numeros[j]);
        }
    }
}
