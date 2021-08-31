import java.util.Scanner;

public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();
		String numWord = "";
		
		switch(num) {
			case 0:
				numWord = "Zero";
				break;
			case 1:
				numWord = "One";
				break;
			case 2:
				numWord = "Two";
				break;
			case 3:
				numWord = "Three";
				break;
			case 4:
				numWord = "Four";
				break;
			case 5:
				numWord = "Five";
				break;
			case 6:
				numWord = "Six";
				break;
			case 7:
				numWord = "Seven";
				break;
			case 8:
				numWord = "Eight";
				break;
			case 9:
				numWord = "Nine";
				break;


		}
	    System.out.println( "You entered " + numWord );
	}
}
