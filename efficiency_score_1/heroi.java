package efficiency_score_1;

public class heroi {
    private String nome;
    private String poder;
    private double altura;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        if (poder != null && !poder.isEmpty()) {
            this.poder = poder;
        } else {
            System.out.println("Poder inválido!");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Idade: " + idade + " anos");
    }
}
