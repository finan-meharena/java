package C.Inheritance.C.ConstructorAndInheritance;

public class TextBox extends UIControl {
    public String text = ""; // field

    // cmd + n to create a constructor
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}