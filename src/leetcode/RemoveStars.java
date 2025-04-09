package leetcode;


public class RemoveStars {
    public static void main(String[] args){
        String input = "leet**cod*e";
        System.out.println(removeStars(input));
    }

    public static String removeStars(String s) {
       StringBuilder rs = new StringBuilder();
       int lastRemovedCharIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '*'){
                rs.append(s.charAt(i));
            }
            else {
                if(!rs.isEmpty()){
                    lastRemovedCharIndex = rs.length() - 1;
                rs.deleteCharAt(lastRemovedCharIndex);
                }
            }
        }
        return rs.toString();
    }

}