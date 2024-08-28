package class_1;

public class people_test {
    public static void main(String[] args) {
        people p1 = new people();
        p1.setNome("Laura");
        p1.setIdade(18);

        System.out.println("Nome " + p1.getNome());
        System.out.println("Idade " + p1.getIdade());
    }
}
