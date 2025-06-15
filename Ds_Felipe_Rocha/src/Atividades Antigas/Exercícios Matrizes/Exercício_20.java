import java.util.Scanner;
import java.util.ArrayList;
public class Exercício_20 {

    public static void main(String args[]){
      Scanner Entrada = new Scanner(System.in);
      int[] Numeros = new int[20];
      ArrayList<Integer> Numeros_Pares = new ArrayList<>();
      ArrayList<Integer> Numeros_Impares = new ArrayList<>();

      System.out.println("Insira os numeros no vetor:");

      for(int i = 0; i < Numeros.length; i++)
      {
          Numeros[i] = Entrada.nextInt();

          if(Numeros[i]%2 == 0)
          {
              Numeros_Pares.add(Numeros[i]);
          }
          else
          {
              Numeros_Impares.add(Numeros[i]);
          }
      }

      System.out.println("Vetor com numeros pares:");
      for(int num: Numeros_Pares)
      {
          System.out.print(num+" ");
      }
      
      System.out.println("Vetor com numeros impares:");
      for(int num : Numeros_Impares)
      {
          System.out.print(num+" ");
      }

    }
}