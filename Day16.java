import java.util.Arrays;

public class Day16 {
    public static int[] integerOfArray(int input){
        int[] newArray = new int[input];
        for (int count = input; count > 0; count--){
            newArray[5-count] = count;
        }
        return newArray;
    }
    public static void main(String[] args){
        int userInput =  5;
        System.out.print(Arrays.toString(integerOfArray(userInput)));

    }
}
