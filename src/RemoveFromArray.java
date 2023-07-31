import java.util.Arrays;

public class RemoveFromArray {
    public static void main(String[] args) {
//        removeElement(new int[]{3,2,2,3},3);
        removeElement2(new int[]{3,2,2,3},3);
    }

    public static int removeElement(int[] arr, int val){
        int count =0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] == val){
                count++;
            }
        }
        int[] res = new int[arr.length - count];
        int j =0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
        return 0;
    }

    static int removeElement2(int[] array, int valueToRemove){
        int shiftCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToRemove) {
                shiftCount++;
            } else {
                array[i - shiftCount] = array[i];
            }
        }

        // Set the last shiftCount elements to 0 or any default value
        for (int i = array.length - shiftCount; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
        return array.length;
    }
}
