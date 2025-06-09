
package ds_felipe_rocha.POO;

public class Veiculo {
        // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano; 
    public String cor;
    
      // Atributos adicionais
    public int Velocidade = 0;
    private int Quilometragem;
    private int Combustivel_Restante;
    private int Aceleracao = 10;
    private String Estado = "Desligado"; // Estado do carro
    
        // Construtor da classe Veiculo
    public Veiculo(String marca,String modelo, int ano,String cor, int Combustivel_restante){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
}
     // Métodos Setters
    public int getCombustivel(){
        return Combustivel_Restante;
    }
    public void setCombustivel(){
        this.Combustivel_Restante = Combustivel_Restante;
    }
public String getMarca() {
        return marca;
    };
     public void setMarca(String marca){
        this.marca = marca;
     };
     
      public String getModelo() {
        return modelo;
    }


     public void setModelo(String modelo){
        this.modelo = modelo;
     };

      public int getAno() {
        return ano;
    }

     public void setAno(int ano){
        this.ano = ano;
     };

     // Métodos getters
        
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    };
        // Metodo para exibir as informações basicas
    public void ExibirInformacao(){
    System.out.println("Marca = "+marca);
    System.out.println("Modelo = "+modelo);
    System.out.println("Ano = "+ano);
    System.out.println("Cor = "+cor);
}
    
    public void Ligar(){
        if(Estado == "Ligado"){
        System.out.println("o veiculo ja esta ligado");
        }
        else{
            Estado = "Ligado";
            System.out.println("O veiculo agora esta ligado");
        }
    }
    
    
     public void Acelerar(){
            if(Estado == "Ligado")
            {
                if(Combustivel_Restante > 0)
                {
                System.out.println("A velocidade atual do carro e igual a :"+ Aceleracao);
                 Velocidade += Aceleracao;
                 Quilometragem += Aceleracao/5;
                 Combustivel_Restante -= Aceleracao/2;
                }   
                else{
                    System.out.println("O carro esta sem combustivel");
                }
            }

            else{
                System.out.println("Ligue o carro primeiro");
            }
         
        }
        
        public void Frear()
        {
            if(Estado.equals("Ligado")){
                while(Velocidade > 0){
                float Freio = 1.3f;
                Velocidade -= Freio;
                System.out.println("O carro está freiando\nVelocidade atual: "+Velocidade+"KM/H");
                }
            }

            else{
                System.out.println("Ligue o carro primeiro");
            };
        }
        
        public void Desligar(){
            if(Estado.equals("Ligado"))
            {
                System.out.println("O carro esta agora desligado;");
            }
            else
            {
                System.out.println("O carro ja esta desligado");
            }
        
}
}
