/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada =  new Scanner(System.in);
        for(int i = 0; i < 1; i++)
        {
            System.out.println("Você deseja ver os numeros na ordem crescente(C) ou decrescente(D)?");
            char Ordem = Entrada.next().toUpperCase().charAt(0);
            if(Ordem == 'C')
            {
                for(int Primeiro_Numero = 1; Primeiro_Numero <=10; Primeiro_Numero++)
                {
                    System.out.println(Primeiro_Numero);
                }
            }
            else{
                for(int Primeiro_Numero = 10; Primeiro_Numero >= 1; Primeiro_Numero--)
                {
                    System.out.println(Primeiro_Numero);
                }
            }
        }
    }
}
