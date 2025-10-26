public class StringsToUpperCase{
	public static void main(String[] args){
		String words = "The lord is good";
		System.out.print(toUpper(words));
	}
	public static String toUpper(String inputs){
		inputs = inputs.toUpperCase();
		return inputs;
	}
}