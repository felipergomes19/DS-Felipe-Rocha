/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[20];
        
        System.out.println("Insira os numeros no vetor:");
        
        for(int i  = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        System.out.println("Escolha um numero para procurar dentro do vetor:");
        int Numero_Escolhido = Entrada.nextInt();
        boolean Numero_Encontrado = false; 
       for(int i = 0; i < Numeros.length; i++)
       {
           if(Numero_Escolhido == Numeros[i])
           {
               Numero_Encontrado = true;
               System.out.println("O numero "+Numero_Escolhido+" foi encontrado na posicao "+i);
               break;
           }
       }
    }
}
