/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos na sua turma:");
        int Quantidade_Alunos = Entrada.nextInt();
        System.out.println("Insira a nota final de seus alunos:");
        int i = 0;
        float Nota_Total = 0;
        while(i < Quantidade_Alunos)
        {
           i+=1;
           float Nota_Aluno = Entrada.nextFloat();
           Nota_Total += Nota_Aluno;
        }
           
        float Media_Nota = Nota_Total/Quantidade_Alunos;
        System.out.println("A media de notas da sala foi de: "+Media_Nota);
        
        }
    }

