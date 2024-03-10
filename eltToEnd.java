import java.util.*;;

public class eltToEnd {
    public static List<Integer> moveElementToEnd(
            List<Integer> array, int toMove) {
        int lastPtr = (array.size() - 1);
        for (int iter = 0; iter < array.size(); iter++) {
            if (array.get(iter) == toMove) {
                while (array.get(lastPtr) == toMove && lastPtr > iter) {
                    lastPtr--;
                }
                Collections.swap(array, iter, lastPtr);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        List<Integer> eltList = moveElementToEnd(array, 2);
        for (int iter = 0; iter < eltList.size(); iter++) {
            System.out.println(eltList.get(iter));
        }
    }
}
