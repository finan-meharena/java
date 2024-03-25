package C.Inheritance.B.ObjectClass;

public class TextBox extends UIControl {
    public String text = ""; // field

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}