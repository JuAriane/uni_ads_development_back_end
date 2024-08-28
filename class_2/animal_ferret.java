package class_2;

public class animal_ferret extends animal {

    public animal_ferret() {
        this.name = "Fernando";
        this.color = "branco";
        this.age = 2;
        this.weight = 550;
    }

    @Override
    public void moviment() {
        System.out.println(
                "O " + this.name + " é um furão " + this.color + " de " + this.age + " anos que pesa " + weight
                        + " gramas.");
    }
}
