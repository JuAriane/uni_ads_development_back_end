package class_2;

public class appliances_test {

    public static void main(String[] args) {

        appliances_refrigerator g1 = new appliances_refrigerator("Brastemp");
        appliances_stove f1 = new appliances_stove("SUPER COOKTOP");

        g1.setTemperature(4.5);
        f1.setPotency(0);

        g1.turnOn();
        f1.turnOn();

        g1.displayInfo();
        f1.displayInfo();
    }
}
