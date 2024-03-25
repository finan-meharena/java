package C.Inheritance.B.ObjectClass;

public class Main {
    public static void main(String[] args) {
        var obj = new Object();
        var box1 = new TextBox();
        var box2 = box1;

        System.out.println(box1.hashCode()); // 1160460865 is the has of its address
        System.out.println(box2.hashCode()); // hashcode is same coz its hash value of address
        System.out.println(box1.toString()); // C.Inheritance.B.ObjectClass.TextBox@452b3a41 ..
                                                // ..(name of class + hashcode in hexadecimal)


    }
}
