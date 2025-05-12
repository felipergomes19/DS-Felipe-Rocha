
    
        // Classe principal com o método Exercício_1
        import java.util.Scanner;
public class Exercício_1
{
    
    public static void main(String args[]) {
            // Criando um objeto da classe Carro
            try (Scanner Entrada = new Scanner(System.in)){        
                    //Entrada de informações pelo usuário
                    System.out.println("Insira a marca do seu carro:");
                    String marca = Entrada.nextLine();

                    System.out.println("Insira o modelo do seu carro:");
                    String modelo = Entrada.nextLine();

                    System.out.println("Insira o ano de fabricação do seu carro:");
                    int ano = Entrada.nextInt();

                    System.out.println("Insira a quantidade de portas do seu carro:");
                    int portas = Entrada.nextInt();

                    System.out.println("Insira a quantidade de rodas do seu carro:");
                    int rodas = Entrada.nextInt();

                    Entrada.nextLine(); // Limpar o buffer

                    System.out.println("Insira a cor do seu carro:");
                    String cor = Entrada.nextLine();
            
                Carro Novo_Carro = new Carro(marca, modelo, ano, portas, rodas, cor);
        
            // Chamando o metodo da classe Carro
        Novo_Carro.ExibirInformacao(); // Exibe marca, modelo, ano, quantidade de portas, quantidade de rodas e cor
            }
        
    }
}
