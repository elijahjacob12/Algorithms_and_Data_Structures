


package edu.sdsu.cs160l.algorithm.search;

import java.util.List;


public class BinarySearch implements Search {
    @Override
    public <T extends Comparable<? super T>> int search(List<T> list, T t) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids int overflow
            int cmp = list.get(mid).compareTo(t);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;   // middle value is smaller than target: keep right half
            } else {
                high = mid - 1;  // middle value is larger than target: keep left half
            }
        }
        return -1;
    }
}
