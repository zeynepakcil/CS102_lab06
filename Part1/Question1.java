package Part1;
public class Question1{
    public static void main(String[] args) {
        String input = "CS102 is the best";
        int count = countLength(input);
        System.out.println("Count: " + count);
    }

    public static int countLength(String input){
        if(input.length() < 1) return -1;
        else if(input.length() == 1) return 1;
        else{
            return 1 + countLength(input.substring(1));
        }
    }
}