
package ds_felipe_rocha.Java.POO.Option_Pane.Exercício_Carro;
import javax.swing.JOptionPane;
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
        JOptionPane.showMessageDialog(null,"Marca = "+marca+"\\n Modelo = "+modelo+"\\nAno = "+ano+"\\nCor = "+cor);

    }

    public void Ligar() {
        if (Estado.equals("Ligado")) {
            JOptionPane.showMessageDialog(null,"O veículo já está ligado");
        } else {
            Estado = "Ligado";
            JOptionPane.showMessageDialog(null,"O veículo agora está ligado");
        }
    }

    public void Acelerar() {
        if (Estado.equals("Ligado")) {
            if (Combustivel_Restante > 0) {
                JOptionPane.showMessageDialog(null,"A velocidade atual do carro é igual a: " + Aceleracao+"Km/h");
                Velocidade += Aceleracao;
                Quilometragem += Aceleracao / 5;
                Combustivel_Restante -= Aceleracao / 2;
            } else {
                JOptionPane.showMessageDialog(null,"O carro está sem combustível");
            }
        } else {
           JOptionPane.showMessageDialog(null,"Ligue o carro primeiro");
        }
    }

    public void Frear() {
        if (Estado.equals("Ligado")) {
            while (Velocidade > 0) {
                float Freio = 1.3f;
                Velocidade -= Freio;
                JOptionPane.showMessageDialog(null,"O carro está freiando\\n Velocidade atual: " + Velocidade + "Km/h");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Ligue o carro primeiro");
        }
    }

    public void Desligar() {
        if (Estado.equals("Ligado")) {
            Estado = "Desligado";
            JOptionPane.showMessageDialog(null,"O carro agora está desligado");
        } else {
           JOptionPane.showMessageDialog(null,"O carro já está desligado");
        }
    }
}
