/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int i = 0;
        float Maior_Numero = 0;
        float Segundo_Maior_Numero = 0;
        
        System.out.println("Insira 10 numeros aleatorios:");
        
        while(i < 10)
        {
            i++;
            float Numero = Entrada.nextFloat();
            if(Numero > Maior_Numero)
            {
                Maior_Numero = Numero;
            }
            
            else if(Numero < Maior_Numero)
                {
                    if(Segundo_Maior_Numero < Numero && Numero < Maior_Numero)
                    {
                        Segundo_Maior_Numero = Numero;
                    }
                }
        }
        
        System.out.println("O maior numero inserido foi:"+Maior_Numero);
        System.out.println("O segundo maior numero inserido foi:"+Segundo_Maior_Numero);
    }
}
