/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i = 0;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Informe a medida do lado do quadrado, entre 1 e 20:");
        int Lado = Entrada.nextInt();
        
        if(Lado < 1 || Lado > 20)
        {
            System.out.println("VALOR INVALIDO, POR FAVOR REINICIE O CODIGO");
        }
        else
        {
        while(i < Lado)
        {
            int j = 0;
            while(j < Lado)
            {
                System.out.print(" * ");
                j++;
            }
            i++;
            System.out.println("");
        }
        }
    }
}
