package aula_01;

public class testavingadores {
    public static void main(String[] args) {
        vingadores HomemDeFerro = new vingadores();

        HomemDeFerro.nome = "Tony Stark";
        HomemDeFerro.sexo = "Masculino";
        HomemDeFerro.habilidades = "Gênio, bilionáiro, filantrópico P*** das Galáxias.";
        HomemDeFerro.idade = 42;
        HomemDeFerro.altura = 1.74;

        HomemDeFerro.salvar();
        HomemDeFerro.correr();
        HomemDeFerro.destruir();

        System.out.println("O nome do vingador é " + HomemDeFerro.nome);

        vingadores CapitaoAmerica = new vingadores();
        CapitaoAmerica.nome = "Steve Rogers";
        CapitaoAmerica.sexo = "Masculino";
        CapitaoAmerica.habilidades = "Força, agilidade, resistência e reflexos";
        CapitaoAmerica.idade = 94;
        CapitaoAmerica.altura = 1.78;

        CapitaoAmerica.salvar();
        CapitaoAmerica.correr();
        CapitaoAmerica.destruir();

        System.out.println("O nome do vingador é " + CapitaoAmerica.nome);
    }
}