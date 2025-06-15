/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escolha até onde a série irá:");
        int Quantidade_Termos = Entrada.nextInt();
        int Primeiro_Termo = 0; 
        int Segundo_Termo = 1;
        for(int i = 0; i < Quantidade_Termos; i++)
        {
            System.out.print(Primeiro_Termo+",");
            int Proximo_Termo = Primeiro_Termo + Segundo_Termo;
            Primeiro_Termo = Segundo_Termo;
            Segundo_Termo = Proximo_Termo;
        }
    }
}
