package C.Inheritance.A.Inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl();
        var textBox =  new TextBox();

        control.disable();;
        System.out.println(control.isEnabled);
        System.out.println(textBox.isEnabled); // coz it extends UIControl, it inherits isEnabled property
    }
}
