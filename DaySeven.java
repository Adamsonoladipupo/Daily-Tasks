import java.util.ArrayList; 

public class DaySeven{
    public static void main(String[] args){
        String sentence = "This is an example";
        String eachWord = "";
        String reverse = "";
        for (int count = 0; count < sentence.length(); count++){
            char letter = sentence.charAt(count);
            eachWord += letter;
            if (letter == ' '){
                for (int counter = eachWord.length()-2; counter >= 0; counter--){
                    char letterTwo = eachWord.charAt(counter);
                    reverse += letterTwo;
                }
                reverse += " ";
                eachWord = "";
            }
            
        }
        for(int count = eachWord.length()-1; count >= 0; count--){
            reverse += eachWord.charAt(count);
        }
        System.out.println(reverse);
        
    }

}