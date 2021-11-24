package Strategy;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length - 1);
    }

    void merge(Integer[] list, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = list[l + i];
        }
        for(int j = 0; j < n2; j++) {
            right[j] = list[m + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                list[k] = left[i];
                i++;
            } else {
                list[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            list[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            list[k] = right[j];
            j++;
            k++;
        }
    }

    void mergeSort(Integer[] list, int l, int r) {
        if (l < r) {
            int m = (l + r)/2;
            mergeSort(list, l ,m);
            mergeSort(list, m + 1, r);
            merge(list, l, m , r);
        }
    }
}
