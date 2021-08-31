import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplesWriter {
    public static void main(String[] args) {
        FileWriter writer;
        PrintWriter printer;
        int multiple = Integer.parseInt(args[0]);
        String filename = args[1];
        try {
            writer = new FileWriter(filename,true);
            printer = new PrintWriter(writer);
            for(int i = 1; i != 13; i++) {
                printer.println(i*multiple);
            }
            printer.close();
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}