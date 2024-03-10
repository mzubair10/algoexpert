public class monotonic {
    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1)
            return true;
        int oIter = 1;
        while (oIter < array.length && array[oIter] == array[0]) {
            oIter++;
        }
        if (oIter == array.length) {
            return true;
        }
        boolean isInc = (array[oIter] - array[0] > 0 ? true : false);
        for (int iter = 2; iter < array.length; iter++) {
            int difference = array[iter] - array[iter - 1];
            if (isInc == true && difference < 0) {
                return false;
            } else if (isInc == false && difference > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = { -1, -1, -1, -1, -1, -1, -1, -1 };
        System.out.println(isMonotonic(array));
    }
}
