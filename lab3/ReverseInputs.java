import java.util.Vector;
import java.util.Scanner;
import java.lang.StringBuffer;

public class ReverseInputs {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String currentLine = "a";
        Vector<StringBuffer> strVector = new Vector<StringBuffer>();
        while(!currentLine.isEmpty()) {
            System.out.println("Enter some text: ");
            currentLine = myScanner.nextLine();
            strVector.add(new StringBuffer(currentLine));
        }
        for(StringBuffer str : strVector) {
            System.out.println(str.reverse());
        }
    }
}