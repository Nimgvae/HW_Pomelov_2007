package HW_20702023;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {0, 3, -2, 4, 3, 2};

        int[] result = removeDuplicates(array);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : array) {
            if (!set.contains(num)) {
                set.add(num);
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
