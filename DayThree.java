import java.util.Arrays;

public class DayThree{
	public static String[] stringToArray(String userInput){
		String[] splited = userInput.split(" ");
		return splited;
	}
	public static void main(String[] args){
		String sentence = "I love Programming";
		
		System.out.print(Arrays.toString(stringToArray(sentence)));
	}
}