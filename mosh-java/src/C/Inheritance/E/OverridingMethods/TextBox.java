package C.Inheritance.E.OverridingMethods;

public class TextBox extends UIControl {
    public String text = ""; // field

    // cmd + n to create a constructor
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }
    @Override
    public String toString(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }

}