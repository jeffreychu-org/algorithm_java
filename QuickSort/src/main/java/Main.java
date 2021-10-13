import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] ary = {5, 4, 3, 2, 1};
        // int[] ary = {7, 6, 5, 4, 3, 2, 1};
        // int[] ary = {1, 2, 3, 4, 5};
        // int[] ary = {5, 4, 3, 3, 3};
        // int[] ary = {3, 3, 3, 2, 1};
        // int[] ary = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        int[] ary = {20, 10, 50, 30, 70, 60, 40};
        QuickSort.quick_sort(ary);
        System.out.println("Quick Sort Result: " + Arrays.toString(ary));
    }
}
