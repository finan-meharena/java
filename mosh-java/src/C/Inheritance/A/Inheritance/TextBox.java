package C.Inheritance.A.Inheritance;

public class TextBox extends UIControl {
    public String text = ""; // field

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}