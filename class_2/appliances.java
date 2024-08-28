package class_2;

public abstract class appliances {

    protected String name;
    protected boolean on;

    public appliances(String name) {
        this.name = name;
        this.on = false;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void displayInfo();
}
