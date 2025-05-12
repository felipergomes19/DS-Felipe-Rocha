
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

        public void Acelerar(){
            
        }
}