public class String_Substring_imp {
    public static void sub(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
    }
}
    }
    public static void sub2(String s){
        for(int i=0;i<s.length();i++){
            StringBuffer sb=new StringBuffer();
            for(int j=i;j<s.length();j++){
               sb.append(s.charAt(j));
               System.out.println(sb);
    }
    }
}
    
    public static void main(String[] args) {
        String str = "abc";
        sub2(str);
    }
}
