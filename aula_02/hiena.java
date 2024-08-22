package aula_02;

public class hiena extends animal {

    public hiena() {
        this.nome = "Banzai";
        this.cor = "cinza escuro";
        this.idade = 15;
        this.peso = 45;
    }

    @Override
    public void movimento() {
        System.out.println(
                "O " + this.nome + " é uma hiena " + this.cor + " de " + this.idade + " anos que pesa " + peso
                        + " kg.");
    }
}
