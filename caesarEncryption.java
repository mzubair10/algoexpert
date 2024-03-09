class Program {
    public static String caesarCypherEncryptor(String str, int key) {
        key = key % 26;
        char[] chArray = str.toCharArray();
        String output = "";
        for (int iter = 0; iter < chArray.length; iter++) {
            int unicodeRep = (int) chArray[iter];
            unicodeRep = unicodeRep + key;
            if (unicodeRep > 122) {
                int difference = unicodeRep - 122;
                unicodeRep = 96 + difference;
            }
            output = (new StringBuilder()).append(output).append(Character.toString(unicodeRep)).toString();
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("z", 3));
    }
}