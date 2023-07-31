import java.util.Arrays;

class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1,2,3,4}));

    }
    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];
        int prod =1;
        for(int i =0; i < nums.length; i++){
            if(i == 0){
                prod =1;
                left[i] = prod;
            }else{
                prod = prod * nums[i-1];
                left[i] = prod;
            }
        }
        System.out.println(Arrays.toString(left));
        for(int i = nums.length-1; i >= 0; i--){
            if(i == nums.length -1 ){
                prod =1;
                right[i]= prod;
            }else{
                prod = prod * nums[i + 1];
                right[i] = prod;
            }
        }
        System.out.println(Arrays.toString(right));
        for(int i =0; i < nums.length; i++){
            res[i] = right[i]* left[i];
        }

        return res;
    }

}