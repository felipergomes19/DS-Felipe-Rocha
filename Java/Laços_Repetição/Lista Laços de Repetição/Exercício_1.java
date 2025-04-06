/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Quantas divisões voce deseja realizar?");
        int Quantidade_Divisao =  Entrada.nextInt();
        for(int i =0; i <Quantidade_Divisao; i++)
        {
            
        System.out.println("\nInsira um valor:");
        float Valor1 = Entrada.nextFloat();
        System.out.println("Insira agora outro valor:");
        float Valor2 = Entrada.nextFloat();
        if(Valor2 == 0)
        {
            System.out.print("VALOR INVALIDO");
        }
        else
        {
            float Divisao = Valor1/Valor2;
            System.out.print("A divisao do primeiro valor pelo segundo valor é igual a:"+Divisao);
        }
        }
    }
}
