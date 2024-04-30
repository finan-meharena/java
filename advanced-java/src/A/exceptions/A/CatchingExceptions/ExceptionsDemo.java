package A.exceptions.A.CatchingExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {

//        FileReader reader = null;
//        try {
//            reader = new FileReader("File.txt");
//            var value = reader.read();
//        }catch (FileNotFoundException ex){
//            ex.printStackTrace();
//            System.out.println("file doesnt exist");
//        } finally  {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
        // Or we can do this
        try (var reader = new FileReader("file.txt");
             var writer = new FileWriter("file.txt");
        ) {
            var value = reader.read();

        } catch (IOException e) {
            System.out.println("Coudlnt read data");
        }

    }

}