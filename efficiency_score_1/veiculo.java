package efficiency_score_1;

public class veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String combustivel;
    private double velocidadeAtual;

    public veiculo(String marca, String modelo, int anoFabricacao, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.velocidadeAtual = 0.0;
    }

    public void ligar() {
        System.out.println("O veículo foi ligado.");
    }

    public void acelerar(double velocidade) {
        if (velocidade > 0) {
            this.velocidadeAtual += velocidade;
            System.out.println("O veículo acelerou. Velocidade atual: " + this.velocidadeAtual + " km/h");
        }
    }

    public void frear(double velocidade) {
        if (velocidade > 0 && this.velocidadeAtual >= velocidade) {
            this.velocidadeAtual -= velocidade;
            System.out.println("O veículo freou. Velocidade atual: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível frear com essa velocidade.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Combustível: " + this.combustivel);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }
}
