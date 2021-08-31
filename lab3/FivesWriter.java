import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FivesWriter {
    public static void main(String[] args) {
        FileWriter writer;
        PrintWriter printer;
        try {
            writer = new FileWriter("times5.txt",true);
            printer = new PrintWriter(writer);
            for(int i = 1; i != 13; i++) {
                printer.println(i*5);
            }
            printer.close();
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}