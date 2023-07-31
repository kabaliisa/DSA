import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println('z'=='z');
//        System.out.println("solo".substring(3,4));

//        System.out.println(interpret("G()(al)"));
        char[] s = "leetcode".toCharArray();
        s[0]='t';
        System.out.println(new String(s));
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    public static String interpret(String command) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        StringBuilder bracesBuilder = new StringBuilder();
        map.put("G","G");
        map.put("()","o");
        map.put("(al)", "al");
        for(Character c: command.toCharArray()){
            if(c == '('){
                bracesBuilder.append(c);
            } else if(!bracesBuilder.isEmpty() && c != ')'){
                bracesBuilder.append(c);
            } else if(!bracesBuilder.isEmpty() && c == ')'){
                bracesBuilder.append(c);
                builder.append(map.get(bracesBuilder.toString()));
                //clear braces builder
                bracesBuilder.setLength(0);
            } else {
                builder.append(map.get(c+""));
            }
        }
        return builder.toString();
    }

    public static String restoreString(String s, int[] indices) {
       HashMap<Integer, Character> map = new HashMap<>();
       StringBuilder sb = new StringBuilder();
       for(int i =0; i < s.length(); i++){
           map.put(indices[i],s.charAt(i));
       }
       for(int i =0; i < s.length(); i++){
           sb.append(map.get(i));
       }
        return sb.toString();
    }
}