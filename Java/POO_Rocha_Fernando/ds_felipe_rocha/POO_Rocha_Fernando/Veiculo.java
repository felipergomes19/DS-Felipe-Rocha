/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
package ds_felipe_rocha;
public class Veiculo {
        // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano; 
    public String cor;
    
      // Atributos adicionais
    private int Velocidade = 0;
    private int Quilometragem = 0;
    private int Combustivel_Restante = 100;
    private String Estado = "Desligado"; // Estado do carro
    
        // Construtor da classe Veiculo
    public Veiculo(String marca,String modelo, int ano,String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
}
     // Métodos Setters
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
    
    public void Ligar(String Estado){
       
    }
    
    
     public void Acelerar(int Aceleracao){
            if(Estado.equals("Ligado"))
            {
                if(Combustivel_Restante > 0)
                {
                System.out.println("");
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
        
        public void Frear(int Aceleracao)
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
        
        public void Desligar(String Estado){
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
