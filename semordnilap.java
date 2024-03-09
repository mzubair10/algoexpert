import java.util.*;

public class semordnilap {
    public static ArrayList<ArrayList<String>> semordnilapF1(String[] words) {
        ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
        Map<String, String> mapOfStringToReverse = new HashMap<>();
        for (String s : words) {
            String reversedString = mapOfStringToReverse.get(new StringBuilder(s).reverse().toString());
            if (reversedString != null) {
                ArrayList<String> matchedList = new ArrayList<>();
                matchedList.add(s);
                matchedList.add(new StringBuilder(s).reverse().toString());
                output.add(matchedList);
            } else {
                mapOfStringToReverse.put(s, new StringBuilder(s).reverse().toString());
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] words = { "dog", "hello", "god" };
        System.out.println(semordnilapF1(words));
    }
}
