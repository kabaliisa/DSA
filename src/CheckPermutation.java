import java.util.Arrays;
import java.util.HashSet;

public class CheckPermutation {
    public static void main(String[] args) {
//        System.out.println(checkPermutation("listen","silent"));
        System.out.println(checkPermutationB("listen","silent"));

    }

    public static boolean checkPermutation(String A, String B){
        HashSet<Character> setA = new HashSet<>();
        HashSet<Character> setB = new HashSet<>();
        for(Character a: A.toCharArray()){
            setA.add(a);
        }
        for(Character b: B.toCharArray()){
            setB.add(b);
        }
        if(A.length() != B.length()) return false;
        for(int i = 0; i < A.length(); i++){
            if(!B.contains(A.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPermutationB(String A, String B){
        char[] aCharArray = A.toCharArray();
        Arrays.sort(aCharArray);
        A = new String(aCharArray);
        char[] bCharArray = B.toCharArray();
        Arrays.sort(bCharArray);
        B = new String(bCharArray);
       if(A.equalsIgnoreCase(B)){
           return true;
       }
       return false;
    }
}
