import java.util.*;

public class commonChars {
    public static String[] commonCharacters(String[] strings) {
        char[] firstStringChar = strings[0].toCharArray();
        Set<Character> inputCharSet = new HashSet<Character>();
        for (int iter = 0; iter < firstStringChar.length; iter++) {
            inputCharSet.add(firstStringChar[iter]);
        }
        if (strings.length > 1) {
            for (int iter = 1; iter < strings.length; iter++) {
                Set<Character> subsequentSet = new HashSet<Character>();
                char[] subsequentChar = strings[iter].toCharArray();
                for (int innerIter = 0; innerIter < subsequentChar.length; innerIter++) {
                    subsequentSet.add(subsequentChar[innerIter]);
                }
                inputCharSet.retainAll(subsequentSet);
            }
        }
        Iterator<Character> itr = inputCharSet.iterator();
        ArrayList<String> outputCollection = new ArrayList<String>();
        while (itr.hasNext()) {
            char c1 = itr.next();
            outputCollection.add(String.valueOf(c1));
        }

        return outputCollection.toArray(new String[outputCollection.size()]);
    }

    public static void main(String[] args) {
        String[] input = { "abcb", "bcd", "cbad", "abcb" };
        String[] output = commonCharacters(input);
        for (int iter = 0; iter < output.length; iter++) {
            System.out.println(output[iter]);
        }
    }
}