package HW_20702023;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = {-1, 4, 0, 2, 7, -3};

        int secondSmallest = findSecondSmallest(array);

        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num > smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
