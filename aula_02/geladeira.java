package aula_02;

public class geladeira extends eletrodomestico {

    private double temperatura;

    public geladeira(String nome) {
        // Usando "super(parâmetro)" para invocar o contrutor da minha Classe Mãe
        super(nome);
        // Como na Classe Mãe o outro parâmetro é um booleano não preciso colocar, pois
        // ele não tem valor
    }

    @Override
    public void ligar() {
        System.out.println("Geladeira " + nome + " ligada.");
        ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Geladeira " + nome + " desligada.");
        ligado = false;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Estado: " + (ligado ? " Ligada." : " Desligada."));
        System.out.println("Temperatura: " + temperatura + " °C.");
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
