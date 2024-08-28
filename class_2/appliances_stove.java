package class_2;

public class appliances_stove extends appliances {

    private int potency;

    public appliances_stove(String nome) {
        super(nome);
    }

    @Override
    public void turnOn() {
        System.out.println("Fogão " + name + " ligado.");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Fogão " + name + " desligado.");
        on = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Estado: " + (on ? "Ligado." : "Desligado."));
        System.out.println("Potência: " + potency + "kW.");
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }
}
