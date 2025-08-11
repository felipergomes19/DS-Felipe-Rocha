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
        System.out.print("Insira o número que voce deseja:");
        int Numero_Escolhido = Entrada.nextInt();
        if(Numero_Escolhido > 10 || Numero_Escolhido < 1)
        {
            System.out.println("VALOR INVALIDO");
        }
        else
        {
        for(int i = 0; i <=10; i++)
        {
            int Produto = Numero_Escolhido*i;
            System.out.println(Numero_Escolhido+" X "+i+":"+Produto);
        }
        }
    }
}
