public class makeUpperCase {
    public static String toUpperCaseN(String input) {
        String[] inputArray = input.split(" ");
        String output = "";
        for (int iter = 0; iter < inputArray.length; iter++) {
            output = (new StringBuilder()).append(output).append(" ").toString();
            String capitalized = inputArray[iter].substring(0, 1).toUpperCase();
            String lowerCase = inputArray[iter].substring(1);
            output = (new StringBuilder()).append(output).append(capitalized).append(lowerCase).toString().trim();
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(toUpperCaseN("this is new to the world"));
    }
}
