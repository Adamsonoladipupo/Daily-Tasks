import java.util.Scanner;

public class TaskTwoTrueLoveFlowerCheck{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Timmy: Enter number of flower: ");
		int timmy = input.nextInt();
		System.out.print("Sarah: Enter number of flower: ");
		int sarah = input.nextInt();

		boolean love = chectForTrueLook(timmy, sarah);
		System.out.printf("True Love: %b", love);
		
	}
	public static boolean chectForTrueLook(int male, int female){
		int check = male + female;
		boolean checker = check % 2 == 1;
		return checker;
	}
}