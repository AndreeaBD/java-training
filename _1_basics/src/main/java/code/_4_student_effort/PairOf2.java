package code._4_student_effort;

import java.util.List;
import java.util.ArrayList;

public class PairOf2 {
    public static void main(String[] args) {
        int[] arr = {5, 9, -5, 7, -5};
        System.out.println(pairOf2(arr));
    }

    public static int pairOf2 (int[] arr) {
        int pairs = 0;
        List<Integer> iHasPair = new ArrayList<>();
        List<Integer> jHasPair = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(!iHasPair.contains(i)) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(!jHasPair.contains(j)) {
                        if(arr[i] + arr[j] == 0) {
                            pairs++;
                            iHasPair.add(i);
                            jHasPair.add(j);
                            break;
                        }
                    }
                }
            }
        }

        return pairs;
    }
}
