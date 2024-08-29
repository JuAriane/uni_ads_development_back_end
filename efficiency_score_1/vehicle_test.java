package efficiency_score_1;

public class vehicle_test {
    public static void main(String[] args) {
        vehicle vehicle1 = new vehicle("Toyota", "Corolla", 2022, "Gasolina");
        vehicle vehicle2 = new vehicle("Honda", "Civic", 2021, "Flex");

        vehicle1.On();
        vehicle1.accelerate(50.0);
        vehicle1.brake(20.0);
        vehicle1.displayInfo();

        vehicle2.On();
        vehicle2.accelerate(60.0);
        vehicle2.brake(30.0);
        vehicle2.displayInfo();
    }
}
