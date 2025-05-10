
    // Superclasee
class Veiculo{
        // Atributos comuns
    String marca;
    String modelo;
    int ano; 
    
    
        // Construtor da classe Veiculo
    public Veiculo(String marca,String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
}
        // Metodo para exibir as informações basicas
    public void ExibirInformacao(){
    System.out.println("Marca = "+marca);
    System.out.println("Modelo = "+modelo);
    System.out.println("Ano = "+ano);
}
}
    // Subclasse que herda da superclasse (Veiculo)
class Carro extends Veiculo{
        // Atributos especifico do Carro
    int portas;
    int rodas;
    String cor;
        // Construtor da classe Carro
    public Carro(String marca,String modelo, int ano, int portas, int rodas, String cor){
        // Usando o super para chamar o construtor da superclasse
        super(marca, modelo, ano);
        this.portas = portas;
        this.rodas = rodas;
        this.cor = cor;
    }
             // Sobrescrevendo o método da superclasse para adicionar mais informações
        public void ExibirInformacao(){
            // Chama o método da superclasse
            super.ExibirInformacao();
            System.out.println("Numero de portas = "+portas);
            System.out.println("Numero de rodas = "+rodas);
            System.out.println("Cor = "+cor);
        } 
}
    
        // Classe principal com o método EX1
public class EX1
{
    
    public static void main(String args[]) {
            // Criando um objeto da classe Carro
        Carro Novo_Carro = new Carro("Lamborghini","Huracan",2014,2,4,"Azul");
        
            // Chamando o metodo da classe Carro
        Novo_Carro.ExibirInformacao(); // Exibe marca, modelo, ano, quantidade de portas, quantidade de rodas e cor
        
        
    }
}
