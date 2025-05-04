/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        int Soma = 0;
        int Quantidade_Maior_Que_Media = 0;
        
        System.out.println("Insira os numeros no vetor:");
        
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
            Soma+=Numeros[i];
        }
        float Media = Soma/Numeros.length;
        
        for(int i = 0; i < Numeros.length; i++)
        {
            if(Numeros[i] > Media)
            {
                Quantidade_Maior_Que_Media +=1;
            }
        }
        System.out.println(Media);
        System.out.println(Quantidade_Maior_Que_Media+" numeros inseridos sao maior que a media total");
    }
}
