package algorithm.slidingwindow;

public class MaxSumSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxSumSubArray(new int[]{4,2,1,7,8,1,2,6,1,0}, 3));
    }

    public static int findMaxSumSubArray(int[] arr, int k){
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(i >= k-1){
                maxValue = Math.max(maxValue, sum);
                sum = sum - arr[i - (k-1)];
            }
        }
        return maxValue;
    }
}
