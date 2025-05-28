public class str_substring {
    static boolean solution(String s,String t){
        int i=0;
        int j=0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == t.length(); 
    }
    public static void main(String[] args) {
        String s="agbdc";
        String t="abc";
        boolean x=solution(s,t);
        System.out.println(x);
    }
}
