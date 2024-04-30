package B.generics.B.ComparabaleInterface;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(3);

        var user1 = new User(1);
        var user2 = new User(2);
        System.out.println(user1.compareTo(user2));
        System.out.println(user2.compareTo(user1));
       
    }
}
