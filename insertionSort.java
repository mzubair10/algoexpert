public class insertionSort {
    public static int[] insertionSortF(int[] list) {
        int currPtr = 1;
        while (currPtr < list.length) {
            int prevPtr = currPtr - 1;
            int tempPtr = currPtr;
            while (prevPtr >= 0) {
                if (list[prevPtr] > list[tempPtr]) {
                    int temp = list[prevPtr];
                    list[prevPtr] = list[tempPtr];
                    list[tempPtr] = temp;
                }
                tempPtr--;
                prevPtr--;
            }
            currPtr++;
        }
        return list;
    }

    public static int[] insertionSortF1(int[] list) {
        for (int outerIter = 1; outerIter < list.length; outerIter++) {
            for (int innerIter = outerIter; innerIter > 0; innerIter--) {
                if (list[innerIter] < list[innerIter - 1]) {
                    int temp = list[innerIter - 1];
                    list[innerIter - 1] = list[innerIter];
                    list[innerIter] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = { 8, 5, 2, 9, 5, 6, 3 };
        int[] output = insertionSortF1(list);
        for (int i : output) {
            System.out.println(i);
        }
    }
}
