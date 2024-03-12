import java.util.*;

public class spiral {
    public static List<Integer> spiralTraverseF(int[][] array) {
        List<Integer> output = new ArrayList<>();
        int countToBeUsed = (int) (Math.ceil(((double) array[0].length / 2)));
        int row = 0, col = 0, start = 0;
        for (int oIter = 0; oIter < countToBeUsed; oIter++) {
            while (col < (array[0].length - start)) {
                output.add(array[row][col]);
                col++;
            }
            row++;
            col--;
            while (row < (array.length - start)) {
                output.add(array[row][col]);
                row++;
            }
            col--;
            row--;
            while (col >= start) {
                output.add(array[row][col]);
                col--;
            }
            row--;
            col++;
            while (row >= start) {
                output.add(array[row][col]);
                row--;
            }
            start = start + 1;
            row = col = start;
        }
        return output;
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> output = new ArrayList<>();
        int startRow = 0, endRow = array.length - 1, startCol = 0, endCol = array[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // 1st iteration
            for (int iter = startCol; iter <= endCol; iter++) {
                output.add(array[startRow][iter]);
            }
            // 2nd iteration
            for (int iter = startRow + 1; iter <= endRow; iter++) {
                output.add(array[iter][endCol]);
            }
            // 3rd iteration
            for (int iter = endCol - 1; iter >= startCol; iter--) {
                if (startRow == endRow)
                    break;
                output.add(array[endRow][iter]);
            }
            // 4th iteration
            for (int iter = endRow - 1; iter > startRow; iter--) {
                if (startCol == endCol)
                    break;
                output.add(array[iter][startCol]);
            }
            startCol = startCol + 1;
            startRow = startRow + 1;
            endCol = endCol - 1;
            endRow = endRow - 1;
        }
        return output;
    }

    public static void main(String[] args) {
        // int[][] array = {
        // { 1, 2, 3 },
        // { 12, 13, 4 },
        // { 11, 14, 5 },
        // { 10, 15, 6 },
        // { 9, 8, 7 }
        // };
        int[][] array = {
                { 27, 12, 35, 26 },
                { 25, 21, 94, 11 },
                { 19, 96, 43, 56 },
                { 55, 36, 10, 18 },
                { 96, 83, 31, 94 },
                { 93, 11, 90, 16 }
        };
        // int[][] array = { { 1, 3, 2, 5, 4, 7, 6 } };
        List<Integer> output = spiralTraverse(array);
        for (int iter = 0; iter < output.size(); iter++) {
            System.out.println(output.get(iter));
        }
    }
}

// int countToBeUsed = (array.length > array[0].length ? array.length :
// array[0].length);
// if (array.length == 1)
// countToBeUsed = 1;
// else
// countToBeUsed = (int) (Math.ceil(((double) array[0].length / 2)));