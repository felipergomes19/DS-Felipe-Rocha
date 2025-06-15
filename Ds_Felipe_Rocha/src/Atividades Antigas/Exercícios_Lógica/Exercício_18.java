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
        Scanner Dados = new Scanner(System.in);
        
        System.out.println("Informe seu sexo:\nMasculino\nFeminino");
        String Sexo = Dados.nextLine();
        
        System.out.println("Informe, em centímetros, a sua altura:");
        int Altura = Dados.nextInt();
        
        System.out.println("Informe seu nome:");
        String Nome = Dados.nextLine();
        
        float Altura_Metros = Altura/100;
        if (Sexo == "Masculino" || Sexo == "masculino"){
            float Peso_Ideal =(72.7f * Altura_Metros)-58;
            System.out.println(Nome +" o seu peso ideal é :"+ Peso_Ideal);
        }
        else{
            float Peso_Ideal = (62.1f * Altura_Metros)-44.7f;
            System.out.println(Nome+" o seu peso ideal é :"+ Peso_Ideal);
        }

        // TODO code application logic here
    }
}
