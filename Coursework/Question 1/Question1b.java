//Rohan Dewan C1946553

import java.util.Scanner;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;

public class Question1b {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int size = 2;

        boolean validSize = false;
        while(!validSize) {
            System.out.print("Enter an odd number: ");
            try {
                size = inScanner.nextInt();
                inScanner.nextLine();
                if(size % 2 != 0) {
                    validSize = true;
                } else {
                    System.out.println("That is not an odd number.");
                }
            } catch(InputMismatchException e) {
                System.out.println("That is not a number.");
                inScanner.nextLine();
            }
        }

        MagicSquare originalSquare = new MagicSquare(size);
        MagicSquare playerSquare = new MagicSquare(size);
        playerSquare.shuffle();

        int i = 0;
        int j = 0;
        String direction = "a";
        int moves = 0;

        System.out.println("Rearrange the square so that all the rows, columns and diagonals sum to " + originalSquare.target);

        while(!playerSquare.equals(originalSquare)) {
            playerSquare.printSquare();

            boolean validInput = false;
            String[] lineSplit = {};
            while(!validInput) {
                System.out.print("Enter row, column and direction as 'x y UDLR': ");
                String line = inScanner.nextLine();
                lineSplit = line.split(" ");
                if(lineSplit.length == 3) {
                    try {
                        i = Integer.parseInt(lineSplit[0]);
                        j = Integer.parseInt(lineSplit[1]);
                        direction = lineSplit[2].toLowerCase();
                        if(direction.equals("u") || direction.equals("d") || direction.equals("l") || direction.equals("r")) {
                            validInput = true;
                        } else {
                            System.out.println("Direction must be u,d,l or r.");
                        }
                    } catch(NumberFormatException e) {
                        System.out.println("x and y must be integers.");
                    }
                } else {
                    System.out.println("Please enter 3 arguments.");
                }
            }
            
            int[] neighbour = {i,j};
            switch(direction) {
                case "u":
                    neighbour[0]--;
                    break;
                case "d":
                    neighbour[0]++;
                    break;
                case "l":
                    neighbour[1]--;
                    break;
                case "r":
                    neighbour[1]++;
                    break;
            }
            playerSquare.swap(i,j,neighbour[0],neighbour[1]);
            moves++;
        }
        playerSquare.printSquare();
        System.out.println("You won in " + moves + "!");
        inScanner.close();
    }
}