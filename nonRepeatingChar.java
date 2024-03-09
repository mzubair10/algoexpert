import java.util.*;

public class nonRepeatingChar {
    public static int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        char[] charRep = string.toCharArray();
        for (int iter = 0; iter < charRep.length; iter++) {
            Integer val = hashMap.get(String.valueOf(charRep[iter]));
            if (val == null) {
                hashMap.put(String.valueOf(charRep[iter]), 1);
            } else {
                hashMap.put(String.valueOf(charRep[iter]), val + 1);
            }
        }

        for (int iter = 0; iter < charRep.length; iter++) {
            if (hashMap.get(String.valueOf(charRep[iter])) == 1) {
                return iter;
            }
        }
        return -1;
    }

    public static int firstNonRepeatingCharacterF(String string) {
        Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
        char[] charArrRep = string.toCharArray();
        for (int iter = 0; iter < charArrRep.length; iter++) {
            if (hashMap.containsKey(charArrRep[iter])) {
                hashMap.put(charArrRep[iter], -1);
            } else {
                hashMap.put(charArrRep[iter], iter);
            }
        }
        for (Map.Entry<Character, Integer> val : hashMap.entrySet()) {
            if (!(val.getValue() == -1)) {
                return val.getValue();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacterF("faadabcbbebdf"));
        // System.out.println(firstNonRepeatingCharacter("faadabcbbebdf"));
    }
}
