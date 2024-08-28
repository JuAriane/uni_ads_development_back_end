package efficiency_score_1;

public class testaheroi {
    public static void main(String[] args) {
        heroi heroi1 = new heroi();
        heroi1.setNome("Superman");
        heroi1.setPoder("Super força");
        heroi1.setAltura(1.90);
        heroi1.setIdade(30);

        heroi heroi2 = new heroi();
        heroi2.setNome("Mulher Maravilha");
        heroi2.setPoder("Força e agilidade");
        heroi2.setAltura(1.75);
        heroi2.setIdade(28);

        heroi heroi3 = new heroi();
        heroi3.setNome("Homem-Aranha");
        heroi3.setPoder("Agilidade e teia de aranha");
        heroi3.setAltura(1.78);
        heroi3.setIdade(22);

        heroi1.exibirInformacoes();
        heroi2.exibirInformacoes();
        heroi3.exibirInformacoes();
    }
}
