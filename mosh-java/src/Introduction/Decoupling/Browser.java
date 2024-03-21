package Introduction.Decoupling;

public class Browser {

    public void navigate(String address, boolean cash){
        String ip = findIPAddress(address, cash);
        String html = sendHttpReqeust(address);
        System.out.println(html);
    }

    private String sendHttpReqeust(String address) {  // set method to private to hide implementation details
        return "<html></html>";
    }

    private String findIPAddress(String address, boolean cash) {
        return "127.0.0.1";
    }
}
