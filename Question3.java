import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> numbers3digit = new ArrayList<String>();
        ArrayList<String> numbers4digit = new ArrayList<String>();

        numbers3digit = binaryGenerator(numbers3digit, 3);
        System.out.println("3 digit binary numbers without 1's coming together: ");
        for (int i = 0; i < numbers3digit.size(); i++)
            System.out.println(numbers3digit.get(i));

        numbers4digit = binaryGenerator(numbers4digit, 4);
        System.out.println("4 digit binary numbers without 1's coming together: ");
        for (int i = 0; i < numbers4digit.size(); i++)
            System.out.println(numbers4digit.get(i));
    }

    public static ArrayList<String> binaryGenerator(ArrayList<String> numbers, int n) {
        ArrayList<String> result = new ArrayList<>();
        if (numbers.size() == 0) {
            result.add("0");
            result.add("1");
            return binaryGenerator(result, n - 1);
        } else if (n == 1) {
            for (String num : numbers) {
                if (num.charAt(num.length() - 1) == '1')
                    result.add(num + "0");
                else {
                    result.add(num + "0");
                    result.add(num + "1");
                }
            }
            return result;
        } else {
            for (String num : numbers) {
                if (num.charAt(num.length() - 1) == '1')
                    result.add(num + "0");
                else {
                    result.add(num + "0");
                    result.add(num + "1");
                }
            }

            return binaryGenerator(result, n - 1);
        }
    }
}
