package aula_01;

public class pessoa {
    private String nome; // Encapsulamento (por usar "private")
    private int idade;

    // Usamos os métodos PÚBLICOS get e set para manipular atributos privados

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {

        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade Inválida!");
        }
    }
}
