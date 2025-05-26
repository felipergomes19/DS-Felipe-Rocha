
    // Superclasee
class Veiculo{
        // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano; 
    public String cor;
    
        // Construtor da classe Veiculo
    public Veiculo(String marca,String modelo, int ano,String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
}
     // Métodos Setters
     public String setMarca(){
        this.marca = marca;
     };

     public String setModelo(){
        this.modelo = modelo;
     };

     public int setAno(){
        this.ano = ano;
     };

     // Métodos getters
    public String getMarca() {
        return marca;
    };

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
        // Metodo para exibir as informações basicas
    public void ExibirInformacao(){
    System.out.println("Marca = "+marca);
    System.out.println("Modelo = "+modelo);
    System.out.println("Ano = "+ano);
    System.out.println("Cor = "+cor);
}
    
    public void Ligar(String Estado){
        public int Velocidade = 0;
        public int Quilometragem = 0;
        public int Combustivel_Restante;
    }
    
    
     public void Acelerar(int Aceleracao){
            if(Estado == "Ligado")
            {
                if(Combustivel_Restante > 0)
                {
                System.out.println("")
                public int Velocidade += Aceleracao;
                public int Quilometragem += Aceleracao/5;
                public int combustivel_Restante -= Aceleracao/2;
                }   
                else{
                    System.out.println("O carro esta sem combustivel");
                }
            }

            else{
                System.out.println("Ligue o carro primeiro");
            }
         
        }
        
        public void Frear(int Aceleracao)
        {
            if(Estado == "Ligado"){
                while(Velocidade > 0){
                public int Freio = 1.3f;
                public int Velocidade -= Freio;
                System.out.println("O carro está freiando");
                }
            }

            else{
                System.out.println("Ligue o carro primeiro");
            };
        }
        
        public void Desligar(String Estado){
            if(Estado == "Ligado")
            {
                System.out.println("O carro esta agora desligado;");
            }
            else
            {
                System.out.println("O carro ja esta desligado");
            }
        
}
}