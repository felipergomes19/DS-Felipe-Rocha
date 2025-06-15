/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Insira o numero que voce deseja:");
        int Numero_Escolhido = Entrada.nextInt();
        int Produto = 1;
        for(int i = Numero_Escolhido;i > 0;i--)
        {
            Produto *=i;
        }
         System.out.print("O resultado de "+Numero_Escolhido+"! é igual a:"+Produto);
    }
}
