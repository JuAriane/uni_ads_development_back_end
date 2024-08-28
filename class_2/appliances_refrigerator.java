package class_2;

public class appliances_refrigerator extends appliances {

    private double temperature;

    public appliances_refrigerator(String name) {
        // Usando "super(parâmetro)" para invocar o contrutor da minha Classe Mãe
        super(name);
        // Como na Classe Mãe o outro parâmetro é um booleano não preciso colocar, pois
        // ele não tem valor
    }

    @Override
    public void turnOn() {
        System.out.println("Geladeira " + name + " ligada.");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Geladeira " + name + " desligada.");
        on = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Estado: " + (on ? " Ligada." : " Desligada."));
        System.out.println("Temperatura: " + temperature + " °C.");
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
