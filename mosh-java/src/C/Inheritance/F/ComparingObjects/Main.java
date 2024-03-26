package C.Inheritance.F.ComparingObjects;

public class Main {
    public static void main(String[] args) {
        var point1 =  new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1 == point2); // false because they reference two different addresses
        System.out.println(point1.equals(point1)); // false

        System.out.println(point1.hashCode());  // 994
        System.out.println(point2.hashCode());  // 994
    }
}
