import java.util.Arrays;

public class minimalDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] output = new int[] {};
        int minDifference = Integer.MAX_VALUE;
        for (int iter = 0; iter < arrayOne.length; iter++) {
            boolean firstTimeIteration = true;
            for (int innerIter = 0; innerIter < arrayTwo.length; innerIter++) {
                int difference = Math.abs(arrayOne[iter] - arrayTwo[innerIter]);
                if (difference <= minDifference) {
                    minDifference = difference;
                    output = new int[] { arrayOne[iter], arrayTwo[innerIter] };
                    firstTimeIteration = false;
                } else if (firstTimeIteration == false) {
                    break;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] firstArray = { -1, 5, 10, 20, 28, 3 };
        int[] secondArray = { 26, 134, 135, 15, 17 };
        System.out.println(smallestDifference(firstArray, secondArray));
    }
}
