/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_13 {

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
        
        System.out.println("------------------");
        System.out.println("Multiplos de 3 inseridos:");
        
        for(int i  = 0; i < Numeros.length; i++)
        {
            if(Numeros[i]%3 == 0)
            {
                System.out.println(Numeros[i]);
            }
        }
    }
}
