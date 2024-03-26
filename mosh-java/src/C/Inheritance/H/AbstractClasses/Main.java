package C.Inheritance.H.AbstractClasses;


public class Main {
    public static void main(String[] args) {
//        UIControl[] controls = {new TextBox(), new CheckBox(), new UIControl()}; // cant instantiate abstract class
        UIControl[] controls = {new TextBox(), new CheckBox()};
       for (var control : controls)
           control.render();
    }
}
