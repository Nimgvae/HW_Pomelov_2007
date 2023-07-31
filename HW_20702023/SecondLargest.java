package HW_20702023;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {-1, 4, 0, 2, 7, -3};

        int secondLargest = findSecondLargest(array);

        System.out.println("Second Largest: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
