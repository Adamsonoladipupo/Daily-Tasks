public class DayFive {
    public static boolean isTrueLove(int femaleNumber, int maleNumber){
        boolean trueLove = false;
        if ((femaleNumber + maleNumber) % 1 == 0){
            trueLove = true;
        }
        else{
            trueLove = false;
        }
        return trueLove;
    }
    public static void main(String[] args){
        int maleFlower = 4;
        int femaleFlower = 5;
        boolean check = isTrueLove(maleFlower, femaleFlower);
        System.out.print("There is true love: " + check);
    }
}
