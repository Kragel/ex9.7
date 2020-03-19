package t_09_interfaces.ex07;

public class Hamster implements Rodent {

    @Override
    public void eat()
    {
        System.out.println("Hamster stuffing food on the cheek");
    }

    @Override
    public void run()
    {
        System.out.println("Hamster runs to it house");
    }

}
