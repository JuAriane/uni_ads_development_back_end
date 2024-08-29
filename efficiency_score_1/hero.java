package efficiency_score_1;

public class hero {
    private String name;
    private String power;
    private double height;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public String getPower() {
        return this.power;
    }

    public void setPower(String power) {
        if (power != null && !power.isEmpty()) {
            this.power = power;
        } else {
            System.out.println("Poder inválido!");
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void displayInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Poder: " + power);
        System.out.println("Altura: " + height + " m");
        System.out.println("Idade: " + age + " anos");
    }
}
