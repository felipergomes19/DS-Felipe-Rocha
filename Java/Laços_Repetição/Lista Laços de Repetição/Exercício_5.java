/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        for(int i = 0; i < 1;i++)
        {
            System.out.print("Informe a primeira nota do aluno:\n");
            float Nota1 = Entrada.nextFloat();
            System.out.println("Informe a segunda nota do aluno:");
            float Nota2 = Entrada.nextFloat();
            if(Nota1 <= 0 || Nota2 <= 0 || Nota1 > 10 || Nota2 > 10)
            {
                System.out.println("VALOR INSERIDO INVALIDO");
                i--;
            }
            else
            {
                float Media = (Nota1 + Nota2)/2;
                System.out.println("A media desse aluno foi de: "+Media);
                System.out.println("NOVO CALCULO(S/N)?");
                char Resposta = Entrada.next().toUpperCase().charAt(0);
                if(Resposta != 'S')
                {
                    break;
                }
                else
                {
                    i--;
                    
                }
            }
        }
    }
}
