package programs.core;

public class FindSmallestNumberFromIntegerArray {

    public static void main(String[] args) {

        int[] arr = {34, 7, 8, 23, 34};
        int smallestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestNumber)
                smallestNumber = arr[i];
        }

        System.out.println("Smallest number: " + smallestNumber);
    }
}
