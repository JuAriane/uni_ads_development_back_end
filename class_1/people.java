package class_1;

public class people {
    private String name; // Encapsulamento (por usar "private")
    private int age;

    // Usamos os métodos PÚBLICOS get e set para manipular atributos privados

    public String getNome() {
        return this.name;
    }

    public void setNome(String name) {
        this.name = name;

    }

    public int getIdade() {
        return this.age;
    }

    public void setIdade(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Idade Inválida!");
        }
    }
}
