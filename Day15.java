public class Day15{
    public static int getPresentSheep(boolean[] array){
        int present = 0;
        for (boolean sheep : array){
            if(sheep == true){
                present++;
            }
        }
        return present;
    }
    public static void main(String[] args){
        boolean[] sheepArray =  { true,  true,  true,  false,  true,  true,  true,  true ,true,  false, true, false,  true,  false, false, true ,true,  true,  true,  true ,false, false, true,  true};
        int result = getPresentSheep(sheepArray);
        System.out.printf("Number of prsent sheep: %d", result);
    }
}