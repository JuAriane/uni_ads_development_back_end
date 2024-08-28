package class_2;

public class animal_lion extends animal {

    public animal_lion() {
        this.name = "Mufasa";
        this.color = "dourado";
        this.age = 10;
        this.weight = 190;
    }

    @Override
    public void moviment() {
        System.out.println(
                "O " + this.age + " é um leão " + this.color + " de " + this.age + " anos que pesa " + weight + " kg.");
    }
}
