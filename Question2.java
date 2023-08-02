public class Question2 {
    public static void main(String[] args) {
        String input = "CS102 is a good course".toLowerCase();
        int nonVowels = nonVowels(input);
        System.out.println("Number of non-vowel letters: " + nonVowels);
    }
    public static int nonVowels(String input){
        char[] chars = {'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'h', 'r', 'w', 'y'};
        if(input.length() == 1){
            for(char ch: chars){
                if(input.charAt(0) == ch)
                return 1;
            }
            return 0;
        }
        else{
            for(char ch: chars){
                if(input.charAt(0) == ch){
                    return 1 + nonVowels(input.substring(1));
                }
            }        
            return nonVowels(input.substring(1));
        }
    }
}
