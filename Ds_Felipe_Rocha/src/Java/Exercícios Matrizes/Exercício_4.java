/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Quantas celulas voce deseja?");
        int Quantidade_Celulas = Entrada.nextInt();
        int[] Numeros = new int[Quantidade_Celulas];
        
        System.out.println("Insira os numeros:");
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        for(int i = Quantidade_Celulas - 1; i >= 0; i--)
        {
            System.out.println(Numeros[i]);
        }
    }
}
