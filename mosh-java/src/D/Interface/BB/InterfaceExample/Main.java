package D.Interface.BB.InterfaceExample;

public class Main {
    public static void main(String[] args) {
        var rabbit = new Rabbit();
        var hawk = new Hawk();
        var fish = new Fish(); // fish has both hunt and flee method coz it implements both prey and predator interface

        rabbit.flee(); // no hunt method
        hawk.hunt(); // no flee method coz we using prey interface
        fish.flee();
        fish.hunt();
    }
}
