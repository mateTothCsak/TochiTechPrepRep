package algorithms.quicksort;

import java.util.Collections;
import java.util.List;

public class QuickSort {


    // This implementation is not perfect YET! Still WIP


    public void sort(List<Integer> toSort) {
        if (toSort != null) {
            sort(toSort, 0, toSort.size() - 1);
        } else {
            throw new IllegalArgumentException("list cannot be empty");
        }
    }

    public void sort(List<Integer> list, int from, int to) {
        int pivot = list.get(to);
        int slowIndex = from;
        int fastIndex = from + 1;
        if (from < to) {
            while (fastIndex <= to && list.get(to) == pivot) {
                while (list.get(slowIndex) < pivot) {  //searches for the first higher number than pivot
                    slowIndex++;
                }
                fastIndex = slowIndex + 1;
                while (list.get(fastIndex) > pivot && fastIndex < to) {
                    fastIndex++;
                }
                if (list.get(slowIndex) > list.get(fastIndex)) { //this if might be not needed
                    Collections.swap(list, slowIndex, fastIndex);
                }
                System.out.println(list);
            }
            if (list.indexOf(pivot) - 1 >= 0) {
                sort(list, from, list.indexOf(pivot) - 1);
            } else if (list.indexOf(pivot) + 1 <= to) {
                sort(list, list.indexOf(pivot) + 1, to);
            }
        }
    }
}
