package A.exceptions.A.CatchingExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show(){
//        sayHello(null);

        FileReader reader = null;
        try {
            reader = new FileReader("File.txt");
            var value = reader.read();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println("file doesnt exist");
        } finally  {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
