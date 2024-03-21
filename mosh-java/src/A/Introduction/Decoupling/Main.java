package A.Introduction.Decoupling;

public class Main {
    public static void main(String[] args) {

        var browser = new Browser();
        browser.navigate("1234", true);  // few methods shown in Main therefore less coupling/dependency
    }

}
