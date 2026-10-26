package programs.core;

public class SumAndAverageOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int sum = 0;

        for (int item : arr)
            sum += item;

        double average = (double) sum/arr.length;

        System.out.println("Sum: " + sum + " and Average: " + average);
    }
}
