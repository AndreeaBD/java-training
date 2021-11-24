package Strategy;

import java.util.Arrays;

public class Sort {
    public void displaySorted (SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String... args) {
        Sort sort = new Sort();
        Integer arr[] = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer copy01OfArr[] = Arrays.copyOf(arr, arr.length);
        Integer copy02OfArr[] = Arrays.copyOf(arr, arr.length);

        System.out.println("\nBubble sort: ");
        sort.displaySorted(new BubbleSort(), copy01OfArr);

        System.out.println("\nMerge sort: ");
        sort.displaySorted(new MergeSort(), copy02OfArr);
    }
}
