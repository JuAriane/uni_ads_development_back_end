package efficiency_score_1;

public class testaveiculo {
    public static void main(String[] args) {
        veiculo veiculo1 = new veiculo("Toyota", "Corolla", 2022, "Gasolina");
        veiculo veiculo2 = new veiculo("Honda", "Civic", 2021, "Flex");

        veiculo1.ligar();
        veiculo1.acelerar(50.0);
        veiculo1.frear(20.0);
        veiculo1.exibirInformacoes();

        veiculo2.ligar();
        veiculo2.acelerar(60.0);
        veiculo2.frear(30.0);
        veiculo2.exibirInformacoes();
    }
}
