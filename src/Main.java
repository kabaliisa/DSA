import java.util.*;
import java.util.stream.Collectors;

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

//        StringBuilder sb = new StringBuilder();
//        String d = "Solomon";
//        for(int  i =d.length()-1; i >= 0; i--){
//            sb.append(d.charAt(i));
//        }
//        System.out.println("d---"+sb.toString());


        List<Integer> nums = Arrays.asList(2,5,10,100,50);
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++ ){
            //0,2: 2,5:, 5,10: 10,100: 100, 50
            max = Integer.max(max, nums.get(i));
        }
        Integer max1 = nums.stream().max(Integer::compareTo).orElse(null);

        System.out.println(max1);

        String name = "Solomon";
        System.out.println(Optional.ofNullable(name).orElse("name is Empty"));

        IntSummaryStatistics summary = nums.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(summary.getMax());

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