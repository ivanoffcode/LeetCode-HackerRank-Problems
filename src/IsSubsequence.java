

public class IsSubsequence {
    public static void main(String[] args){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        StringBuilder common = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (t.indexOf(ch) != -1) {
                common.append(ch);
            }
        }

        return common.toString().equals(s);
    }

}
