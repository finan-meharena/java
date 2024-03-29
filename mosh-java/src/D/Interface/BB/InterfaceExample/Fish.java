package D.Interface.BB.InterfaceExample;

public class Fish implements Predator, Prey{

    @Override
    public void hunt() {
        System.out.println("Fish hunting");
    }

    @Override
    public void flee() {
        System.out.println("Fish fleeing");
    }
}
