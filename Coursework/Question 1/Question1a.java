//Rohan Dewan C1946553

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1a {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        int size = 2;
        boolean validInput = false;

        while(!validInput) {
            System.out.print("Enter an odd number: ");
            try {
                size = inScanner.nextInt();
                inScanner.nextLine();
                if(size % 2 != 0) {
                    validInput = true;
                } else {
                    System.out.println("That is not an odd number.");
                }
            } catch(InputMismatchException e) {
                System.out.println("That is not a number.");
                inScanner.nextLine();
            }
        }
        inScanner.close();

        MagicSquare mySquare = new MagicSquare(size);
        mySquare.printSquare();

    }
}