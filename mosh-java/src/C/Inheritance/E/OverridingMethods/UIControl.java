package C.Inheritance.E.OverridingMethods;

public class UIControl {
    public boolean isEnabled;

    public UIControl( boolean isEnabled) {
        this.isEnabled = true;
        System.out.println("UIControl");
    }

    public void enable(){
        isEnabled =  true;
    }
    public void  disable(){
        isEnabled = false;
    }


}
