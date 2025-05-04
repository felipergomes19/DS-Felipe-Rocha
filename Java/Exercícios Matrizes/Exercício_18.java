

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercício_18{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[20];
        
        System.out.println("Insira os numeros no vetor:");
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        Arrays.sort(Numeros);
        
        System.out.println("Insira o numero que voce deseja buscar:");
        int Numero_Alvo = Entrada.nextInt();
        
        int Resultado_Busca = Busca_Binaria(Numeros,Numero_Alvo);
        
        if(Resultado_Busca == -1)
        {
            System.out.println("Numero nao encontrado no vetor");
        }
        
        else
        {
            System.out.println("Numero encontrado na posicao: "+Resultado_Busca);
        }
        
        Entrada.close();
    }
    public static int Busca_Binaria(int[] Numeros, int Numero_Alvo) {
  int inicio = 0;
  int fim = Numeros.length - 1;
  
  while(inicio <= fim -1)
  {
   int meio = (inicio + fim)/2;
    if(Numeros[meio] == Numero_Alvo){
       return meio;
    }
    else if(Numeros[meio] < Numero_Alvo){
      inicio = meio + 1;
    }
    else{
     fim = meio - 1;
    }
  }
  return -1;
}

}

 