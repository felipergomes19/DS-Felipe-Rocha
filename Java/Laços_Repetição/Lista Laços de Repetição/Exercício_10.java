/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Insira um numero aleatorio:");
        int Numero_Escolhido = Entrada.nextInt();
        for(int i = 1; i <= Numero_Escolhido; i++)
        {
            if(Numero_Escolhido <= 0)
            {
                System.out.print("VALOR INVALIDO");
                break;
            }
            else
            {
            System.out.println(i);
            }
        }
    }
}
