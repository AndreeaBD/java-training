package Iterator;

import java.util.ArrayList;

public class ArrayCustomIterator {
    int pos = 0;
    int[] array;

    ArrayCustomIterator(int arr[]) {
        array = arr;
    }

    boolean hasNext() {
        return pos < array.length;
    }

    int next() {
        return array[pos++];
    }

    public static void main(String ...args) {
        int arr[] = new int[] {1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
