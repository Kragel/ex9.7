package t_09_interfaces.ex07.copy;

public class Mouse implements Rodent {

    @Override
    public void eat()
    {
        System.out.println("Mouse eats cheese");
    }

    @Override
    public void run()
    {
        System.out.println("The mouse runs into a mink");
    }

}
