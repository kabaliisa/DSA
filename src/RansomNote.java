import java.util.ArrayList;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
            if(!ransomNote.equals(ransomNote.toLowerCase()) || !magazine.equals  (magazine.toLowerCase())){
                return false;
            }
            ArrayList<String> list = new ArrayList<>();
            for(char c : ransomNote.toCharArray()){
                list.add(c+"");
            }
            for(int i = 0; i < magazine.length(); i++ ){
                if(list.contains(magazine.charAt(i)+"")){
                    list.remove(magazine.charAt(i)+"");
                }
            }

            if(list.isEmpty()){
                return true;
            }
            return false;

        }

}
