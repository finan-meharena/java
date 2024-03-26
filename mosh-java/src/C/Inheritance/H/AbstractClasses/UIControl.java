package C.Inheritance.H.AbstractClasses;

public abstract class UIControl {
    public boolean isEnabled;

//    public UIControl( boolean isEnabled) {
//        this.isEnabled = true;
//        System.out.println("UIControl");
//    }

    public abstract void render(); // shared functionality, but different implementation for each class

    public void enable(){
        isEnabled =  true;
    }
    public void  disable(){
        isEnabled = false;
    }


}
