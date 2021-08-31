import java.util.Scanner;

public class PrintStarRectangle {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter width: ");
        int width = myScanner.nextInt();

        System.out.println("Enter height: ");
        int height = myScanner.nextInt();

        for(int x = 0; x < height; x++) {
            for(int y = 0; y < width; y++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}