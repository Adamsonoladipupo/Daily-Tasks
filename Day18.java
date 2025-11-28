import java.util.Arrays;

public class Day18{
    public static int[] inverseOfArray(int[] numbers){
        int[] new_numbers = new int[numbers.length];
        for (int count = 0; count < numbers.length; count++){
            numbers[count] = numbers[count] * -1;
            new_numbers[count] = numbers[count];
        }
        return new_numbers;
    }
    public static void main(String[] args){
        int[] numbers = {1, -2, 3, -4, 5, 1, -2, 3, -4, 5};
        System.out.print(Arrays.toString(inverseOfArray(numbers)));
    }
}