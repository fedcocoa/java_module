import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String keyword;
        File searchFile;
        if(args[0].equals("-i")) {
            keyword = args[1];
            searchFile = new File(args[2]);
        } else {
            keyword = args[0];
            searchFile = new File(args[1]);
        }
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(searchFile);
            while(fileScanner.hasNextLine()) {
                String nextLine = fileScanner.nextLine();
                if((args[0].equals("-i") && nextLine.toLowerCase().contains(keyword.toLowerCase())) | nextLine.contains(keyword)) {
                    System.out.println(nextLine);
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}