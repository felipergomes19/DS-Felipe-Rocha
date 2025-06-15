/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int Quantidade_Pares = 0;
        int Quantidade_Impares = 0;
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        System.out.println("Insira os numeros:");
        for(int i = 0; i < Numeros.length; i++ )
        {
            int Numero = Entrada.nextInt();
            if(Numero %2 == 0)
            {
                Quantidade_Pares+=1;
            }
            else{
                Quantidade_Impares +=1;
            }
        }
        
        System.out.println("Foram inseridos "+Quantidade_Pares+" numeros pares");
        System.out.println("Foram inseridos "+Quantidade_Pares+" numeros impares");
    }
}
