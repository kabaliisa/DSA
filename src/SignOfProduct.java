public class SignOfProduct {

    public static void main(String[] args) {
        int[] nums = new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};

        System.out.println(arraySign(nums));
    }
    public static int arraySign(int[] nums) {
        long product = 1;
        for(int val: nums){
//            System.out.println(val);
            product = product * val;
            System.out.println(product);
        }
//        System.out.println(product);
        return signFunc(product);
    }
    public static int signFunc(long x){
        if( x > 0){
            return 1;
        } else if(x < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
