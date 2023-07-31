import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        System.out.println(isUnique("solo"));
    }
    public static boolean isUnique(String s){
        HashSet<Character> set = new HashSet<>();
        for(Character c: s.toCharArray()){
            if(!set.add(c)){
                return false;
            }
        }
        return true;
    }
    // without additional data structure
    public static boolean isUnique2(String s){
        for(int i =0; i < s.toCharArray().length; i++){
            for(int j=0; j < s.toCharArray().length; j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }

        }
        return true;
    }
}
