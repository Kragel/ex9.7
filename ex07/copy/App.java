package t_09_interfaces.ex07.copy;

public class App {

    private static final int SIZE = 2;

    public static void main(String[] args)
    {
        Rodent[] rodents = new Rodent[SIZE];

        rodents[0] = new Mouse();
        rodents[1] = new Hamster();

        rodents[0].eat();
        rodents[1].eat();

        rodents[0].run();
        rodents[1].run();
    }

}
