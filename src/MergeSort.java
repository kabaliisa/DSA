import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{1,4,3,20,18})));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

    public static int[] mergeSort(int[] a){
        if(a.length == 1){
            return a;
        }
        int mid = a.length/2;
        int[] left = new int[mid];
        int[] right = new int[a.length-mid];
        for(int i =0; i< mid; i++){
            left[i] = a[i];
        }
        for(int i = mid, j=0; i < a.length && j< right.length; i++, j++){
            right[j] = a[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }





}


