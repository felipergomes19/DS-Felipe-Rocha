/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Insira um numero:");
        float Numero1 = Entrada.nextFloat();
        
        System.out.println("Insira outro numero:");
        float Numero2 = Entrada.nextFloat();
        
        if(Numero2 == 0)
        {
            System.out.println("VALOR INVALIDO");
        }
        
        float Divisao = Numero1/Numero2;
        System.out.println("O resultado da divisao e igual a:"+Divisao);
                // TODO code application logic here
    }
}
