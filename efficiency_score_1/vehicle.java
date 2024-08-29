package efficiency_score_1;

public class vehicle {
    private String brand;
    private String model;
    private int manufacturingYear;
    private String fuel;
    private double currentSpeed;

    public vehicle(String brand, String model, int manufacturingYear, String fuel) {
        this.brand = brand;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.fuel = fuel;
        this.currentSpeed = 0.0;
    }

    public void On() {
        System.out.println("O veículo foi ligado.");
    }

    public void accelerate(double velocity) {
        if (velocity > 0) {
            this.currentSpeed += velocity;
            System.out.println("O veículo acelerou. Velocidade atual: " + this.currentSpeed + " km/h");
        }
    }

    public void brake(double velocity) {
        if (velocity > 0 && this.currentSpeed >= velocity) {
            this.currentSpeed -= velocity;
            System.out.println("O veículo freou. Velocidade atual: " + this.currentSpeed + " km/h");
        } else {
            System.out.println("Não é possível frear com essa velocidade.");
        }
    }

    public void displayInfo() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Ano de Fabricação: " + this.manufacturingYear);
        System.out.println("Combustível: " + this.fuel);
        System.out.println("Velocidade Atual: " + this.currentSpeed + " km/h");
    }
}
