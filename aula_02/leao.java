package aula_02;

public class leao extends animal {

    public leao() {
        this.nome = "Mufasa";
        this.cor = "dourado";
        this.idade = 10;
        this.peso = 190;
    }

    @Override
    public void movimento() {
        System.out.println(
                "O " + this.nome + " é um leão " + this.cor + " de " + this.idade + " anos que pesa " + peso + " kg.");
    }
}
