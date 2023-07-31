package HW_20702023;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




    public class CommonElements {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
            int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

            List<Integer> commonElements = findCommonElements(array1, array2);

            System.out.println("Common Elements: " + commonElements);
        }

        public static List<Integer> findCommonElements(int[] array1, int[] array2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int num : array1) {
                set1.add(num);
            }

            for (int num : array2) {
                if (set1.contains(num)) {
                    set2.add(num);
                }
            }

            return new ArrayList<>(set2);
        }
    }

