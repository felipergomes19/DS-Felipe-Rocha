/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i = 0;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de lados,entre 1 e 20");
        int Lados = Entrada.nextInt();
        if(Lados < 1|| Lados > 20)
        {
            System.out.println("NUMERO INVALIDO, REINICIE O CODIGO");
        }
        else
        {
            while(i < Lados)
            {
                int j = 0;
                while(j < Lados)
                {
                    if(i == 0|| i == Lados - 1|| j == 0 || j == Lados - 1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                       System.out.print("  ");
                    } 
                    j++;
                }
                System.out.println();
                i++;
            }
        }

    }
}

,