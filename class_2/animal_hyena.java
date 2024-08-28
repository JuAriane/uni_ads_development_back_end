package class_2;

public class animal_hyena extends animal {

    public animal_hyena() {
        this.name = "Banzai";
        this.color = "cinza escuro";
        this.age = 15;
        this.weight = 45;
    }

    @Override
    public void moviment() {
        System.out.println(
                "O " + this.name + " é uma hiena " + this.color + " de " + this.age + " anos que pesa " + weight
                        + " kg.");
    }
}
