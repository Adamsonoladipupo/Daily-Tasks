import java.util.Scanner;

public class DayFour{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);

		System.out.print("Enter the month of the year (from 1 - 12): ");
		int userInput = inputCollector.nextInt();
		
		if ( userInput >= 1 && userInput <= 3){
			System.out.print("First quarter of the year");
		}
		else if ( userInput >= 4 && userInput <= 6){
			System.out.print("Second quarter of the year");
		}
		else if ( userInput >= 7 && userInput <= 9){
			System.out.print("Third quarter of the year");
		}
		else if ( userInput >= 10 && userInput <= 12){
			System.out.print("Fourth quarter of the year");
		}
		else {
			System.out.print("Invalid input");
		}
		
	}
}