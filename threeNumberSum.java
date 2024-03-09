import java.lang.reflect.Array;
import java.util.*;

public class threeNumberSum {
    public static List<Integer[]> threeNumberSumF(int[] array, int targetSum) {
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(array);
        for (int iter = 0; iter < array.length; iter++) {
            if (array[iter] > targetSum) {
                return output;
            }
            int firstPtr = iter, secondPtr = firstPtr + 1, lastPtr = array.length - 1;
            while (secondPtr < lastPtr) {
                int sum = array[firstPtr] + array[secondPtr] + array[lastPtr];
                if (sum == targetSum) {
                    Integer[] collection = new Integer[] { array[firstPtr], array[secondPtr], array[lastPtr] };
                    output.add(collection);
                    secondPtr++;
                    lastPtr--;
                } else if (sum < targetSum) {
                    secondPtr++;
                } else {
                    lastPtr--;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] list = { 12, 3, 1, 2, -6, 5, -8, 6 };
        List<Integer[]> output = threeNumberSumF(list, 0);
        for (Integer[] i : output) {
            for (Integer j : i) {
                System.out.println((j));
            }
        }
    }
}
