import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharReader {
    public static void main(String[] args) {
        FileReader reader;
        try {
            reader = new FileReader("alphabet.txt");
            try {
                int c = reader.read();
                while(c != -1) {
                    System.out.println((char)c);
                    c = reader.read();
                }
            } catch(IOException e) {
                System.out.println(e);
            }
            
            
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        
    }
}