package efficiency_score_1;

public class hero_test {
    public static void main(String[] args) {
        hero hero1 = new hero();
        hero1.setName("Superman");
        hero1.setPower("Super força");
        hero1.setHeight(1.90);
        hero1.setAge(30);

        hero hero2 = new hero();
        hero2.setName("Mulher Maravilha");
        hero2.setPower("Força e agilidade");
        hero2.setHeight(1.75);
        hero2.setAge(28);

        hero hero3 = new hero();
        hero3.setName("Homem-Aranha");
        hero3.setPower("Agilidade e teia de aranha");
        hero3.setHeight(1.78);
        hero3.setAge(22);

        hero1.displayInfo();
        hero2.displayInfo();
        hero3.displayInfo();
    }
}
