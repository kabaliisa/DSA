import java.util.Arrays;

public class Adder {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] res = new int[nums.length];
        int[] resLeft = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            res[i] = add(nums, i+1, 0);
        }
        System.out.println(Arrays.toString(res));
        for(int i = 0; i < nums.length; i++){
            resLeft[i] = addLeft(nums, i, 0,0);
        }
        System.out.println(Arrays.toString(resLeft));
        System.out.println(Arrays.toString(getRes(res,resLeft)));
    }

    public static int[] getRes(int[]res, int[] resLeft){
        int[] result = new int[res.length];
        for(int i = 0; i < res.length; i++){
            result[i] = Math.abs(res[i] - resLeft[i]);
        }
        return result;
    }
    public static int add(int[]nums, int i, int sum){
        if ( i < nums.length) {
            sum+= nums[i];
            return add(nums, i+1, sum);
        }
        return sum;
    }
    public static int addLeft(int[]nums, int i, int sum, int start){
        if(start < i){
            sum += nums[start];
            return addLeft(nums, i, sum, start+1);
        }
        return sum;
    }
}
