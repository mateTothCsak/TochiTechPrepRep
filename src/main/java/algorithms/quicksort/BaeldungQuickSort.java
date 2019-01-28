package algorithms.quicksort;

import java.util.Collections;
import java.util.List;

public class BaeldungQuickSort {

    public void sort(List<Integer> toSort) {
        if (toSort != null ) {
            sort(toSort, 0, toSort.size() - 1);
        } else {
            throw new IllegalArgumentException("list cannot be empty");
        }
    }

    public void sort(List<Integer> list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sort(list, from, right - 1); // <-- pivot was wrong!
            sort(list, right + 1, to);   // <-- pivot was wrong!
        }
    }
}
