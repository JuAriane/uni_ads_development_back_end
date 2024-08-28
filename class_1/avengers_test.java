package class_1;

public class avengers_test {
    public static void main(String[] args) {
        avengers IronMan = new avengers();

        IronMan.name = "Tony Stark";
        IronMan.gender = "Masculino";
        IronMan.skill = "Gênio, bilionáiro, filantrópico P*** das Galáxias.";
        IronMan.age = 42;
        IronMan.height = 1.74;

        IronMan.save();
        IronMan.run();
        IronMan.destroy();

        System.out.println("O nome do vingador é " + IronMan.name);

        avengers CaptainAmerica = new avengers();
        CaptainAmerica.name = "Steve Rogers";
        CaptainAmerica.gender = "Masculino";
        CaptainAmerica.skill = "Força, agilidade, resistência e reflexos";
        CaptainAmerica.age = 94;
        CaptainAmerica.height = 1.78;

        CaptainAmerica.save();
        CaptainAmerica.run();
        CaptainAmerica.destroy();

        System.out.println("O nome do vingador é " + CaptainAmerica.name);
    }
}