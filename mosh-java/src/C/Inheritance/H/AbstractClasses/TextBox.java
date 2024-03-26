package C.Inheritance.H.AbstractClasses;

public class TextBox extends UIControl {  // TextBox must either be abstract or declare render method
    public String text = ""; // field

    @Override
    public void render() {
        System.out.println("Render TextBox");
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