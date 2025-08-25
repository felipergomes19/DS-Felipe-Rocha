
package ds_Rocha_Fernando.POO;

public class Veiculo {
    // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    // Atributos adicionais
    protected int Velocidade = 0;
    protected int Quilometragem;
    protected int Combustivel_Restante;
    protected int Aceleracao = 10;
    protected String Estado = "Desligado"; // Estado do carro

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano, String cor, int Combustivel_Restante) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.Combustivel_Restante = Combustivel_Restante;
    }

    // Métodos Getters e Setters
    public int getCombustivel() {
        return Combustivel_Restante;
    }

    public void setCombustivel(int Combustivel_Restante) {
        this.Combustivel_Restante = Combustivel_Restante;
    }

     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

     public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para exibir as informações básicas
    public void ExibirInformacao() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Ano = " + ano); 
        System.out.println("Cor = " + cor);
    }

    public void Ligar() {
        if (Estado.equals("Ligado")) {
            System.out.println("O veículo já está ligado");
        } else {
            Estado = "Ligado";
            System.out.println("O veículo agora está ligado");
        }
    }

    public void Acelerar() {
        if (Estado.equals("Ligado")) {
            if (Combustivel_Restante > 0) {
                System.out.println("A velocidade atual do carro é igual a: " + Aceleracao+"Km/h");
                Velocidade += Aceleracao;
                Quilometragem += Aceleracao / 5;
                Combustivel_Restante -= Aceleracao / 2;
            } else {
                System.out.println("O carro está sem combustível");
            }
        } else {
            System.out.println("Ligue o carro primeiro");
        }
    }

    public void Frear() {
        if (Estado.equals("Ligado")) {
            while (Velocidade > 0) {
                float Freio = 1.3f;
                Velocidade -= Freio;
                System.out.println("O carro está freiando\\n Velocidade atual: " + Velocidade + "Km/h");
            }
        } else {
            System.out.println("Ligue o carro primeiro");
        }
    }

    public void Desligar() {
        if (Estado.equals("Ligado")) {
            Estado = "Desligado";
            System.out.println("O carro agora está desligado");
        } else {
            System.out.println("O carro já está desligado");
        }
    }
}
