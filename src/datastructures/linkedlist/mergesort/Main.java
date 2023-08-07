package datastructures.linkedlist.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        System.out.println(Arrays.toString(ms.mergeSort(new int[]{4,7,2,9})));
    }
}
