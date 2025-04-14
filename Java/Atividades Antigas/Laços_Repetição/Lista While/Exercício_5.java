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
        Scanner Entrada = new Scanner(System.in);
        int i = 0;
        System.out.println("Insira dez numeros aleatórios:");
        float Maior_Numero = 0;
        while(i < 10)
        {
            i+=1;
            float Numero = Entrada.nextFloat();
            if(Numero > Maior_Numero)
            {
                Maior_Numero = Numero;
            }
        }
        System.out.println("O maior numero inserido foi:"+Maior_Numero);
}
}
