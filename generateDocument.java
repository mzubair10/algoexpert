import java.util.*;;

public class generateDocument {
    public static boolean generateDocumentF(String characters, String document) {
        Map<String, Integer> mapOfCharsToCount = new HashMap<String, Integer>();
        Map<String, Integer> mapOfDocCharsToCount = new HashMap<String, Integer>();
        char[] charArrRep = characters.toCharArray();
        for (int iter = 0; iter < charArrRep.length; iter++) {
            Integer oldValue = mapOfCharsToCount.get(String.valueOf(charArrRep[iter]));
            if (oldValue == null) {
                mapOfCharsToCount.put(String.valueOf(charArrRep[iter]), 1);
            } else {
                mapOfCharsToCount.put(String.valueOf(charArrRep[iter]), oldValue + 1);
            }
        }

        char[] docCharRep = document.toCharArray();
        for (int iter = 0; iter < docCharRep.length; iter++) {
            Integer oldValue = mapOfDocCharsToCount.get(String.valueOf(docCharRep[iter]));
            if (oldValue == null) {
                mapOfDocCharsToCount.put(String.valueOf(docCharRep[iter]), 1);
            } else {
                mapOfDocCharsToCount.put(String.valueOf(docCharRep[iter]), oldValue + 1);
            }
        }
        for (var entry : mapOfDocCharsToCount.entrySet()) {
            String key = entry.getKey();
            Integer keyCountInDocMap = entry.getValue();
            Integer keyCountInCharMap = (mapOfCharsToCount.containsKey(key) ? mapOfCharsToCount.get(key) : 0);
            if (keyCountInCharMap >= keyCountInDocMap) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(generateDocumentF("helloworldO", "hello wOrld"));
    }
}
