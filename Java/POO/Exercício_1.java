
    // Superclasee
class Veiculo{
        // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano; 
    
    
        // Construtor da classe Veiculo
    public Veiculo(String marca,String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
}
     // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
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
    
        // Atributos privados específicos da subclasse
    private int portas;
    private int rodas;
    private String cor;
    
        // Construtor da classe Carro
    public Carro(String marca,String modelo, int ano, int portas, int rodas, String cor){
        
        // Usando o super para chamar o construtor da superclasse
        super(marca, modelo, ano);
        this.portas = portas;
        this.rodas = rodas;
        this.cor = cor;
    }
    // Getters e Setters
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
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
