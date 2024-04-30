package B.generics.A.Intro;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(3);

       var genericList = new GenericList<String>();

       genericList.add("hello");
        System.out.println(genericList.get(0));
       
    }
}
