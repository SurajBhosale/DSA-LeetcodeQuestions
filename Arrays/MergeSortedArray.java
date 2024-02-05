package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here

        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<a.length;i++){
        // set.add(a[i]);
        // }

        // for(int i=0;i<b.length;i++){
        // set.add(b[i]);
        // }

        // List<Integer> myList = new ArrayList<>();

        // for(int s:set){
        // myList.add(s);
        // }

        // Collections.sort(myList);
        // return myList;

        List<Integer> myList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                myList.add(a[i]);
                i++;
            } else {
                myList.add(b[j]);
                j++;
            }

        }

        if (j < b.length) {
            for (int k = j; k < b.length; k++) {
                myList.add(b[k]);
            }
        }
        if (i < a.length) {
            for (int k = i; k < a.length; k++) {
                myList.add(a[k]);
            }
        }

        return myList;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6 };
        int[] b = { 2, 3, 5 };

        System.out.println(sortedArray(a, b));
    }
}
