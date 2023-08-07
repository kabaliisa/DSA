package datastructures.linkedlist.mergesort;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] a){
        if(a.length == 1) return a;
        int mid = a.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(a,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a,mid, a.length));
        return merge(left,right);
    }

    public int[] merge(int[] array1, int[] array2){
        int[] combined = new int[array1.length+array2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                if(array2[j] < array1[i]){
                    combined[index] = array2[j];
                    index++;
                    j++;
                }
            }
        }
        while(i < array1.length){
            combined[index] = array1[i];
            index++;
            i++;
        }
        while(j < array2.length){
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }
}
