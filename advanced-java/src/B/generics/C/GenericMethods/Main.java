package B.generics.C.GenericMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.max(11,2));

       Utils.print("finan", "meharena");

       User user = new User(10);
       var users = new GenericList<User>();

       Utils.printUser(user);

    }
}
