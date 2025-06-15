/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
 import java.util.Scanner;
public class Exercício_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade de numeros que voce deseja inserir:");
        int Quantidade_Numeros = Entrada.nextInt();
        int Maior_Numero = 0;
        int Menor_Numero = 0;
        int Soma = 0;
        for(int i = 1; i <= Quantidade_Numeros; i++)
        {
            System.out.println("Insira o"+i+"º numero:");
            int Numero = Entrada.nextInt();
            if(Numero > Maior_Numero)
            {
                Maior_Numero = Numero;
            }
            else
            {
                Menor_Numero = Numero;
            }
            Soma +=Numero;
    }
        System.out.println("O maior numero inserido foi:"+Maior_Numero);
        System.out.println("O menor numero inserido foi:"+Menor_Numero);
        System.out.println("A soma de todos os numeros e igual a:"+Soma);
}
}
