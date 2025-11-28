public class Day17 {
    public static void main(String[] args){
        String sentence = "Hello World";
        String newSentence = "";
        for (int count = 0; count < sentence.length(); count++){
            for (int doubleLetter = 0; doubleLetter < 2; doubleLetter++){
                newSentence += sentence.charAt(count);
            }
        }
        System.out.print(newSentence);
    }
}
