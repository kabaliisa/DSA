package algorithm.slidingwindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(new int[]{5,6,7,8,9}, 8));
        System.out.println(bs.binarySearch2(new int[]{5,6,8,9}, 8));
    }
    public boolean binarySearch(int[] arr, int num){
        if(arr.length == 0 ) return false;
        int mid = arr.length/2;
        if(arr.length == 1 && num != arr[mid]) return false;
        if(arr.length > 0 && num == arr[mid]){
            return true;
        }
        if(num < arr[mid]){
            return binarySearch(Arrays.copyOfRange(arr, 0, mid), num);
        }else{
            return binarySearch(Arrays.copyOfRange(arr, mid+1,arr.length), num);
        }
    }
    public int binarySearch2(int[] arr, int num){
       if(arr.length == 0) return 0;
       int left =0;
       int right = arr.length -1;
       while(left < right){
           int mid = (left + right) / 2;
           if(num == arr[mid]){
               return mid;
           }
           if(num < arr[mid]){
               right = mid+1;
           }else{
               left = mid;
           }
       }
       return 0;
    }
}
