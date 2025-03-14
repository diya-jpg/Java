public class String_permutation {
    public static boolean permu(String s,String s1){
        if(s.length()!=s1.length()){
            return false;
        }
        int []freq=new int[256];
        int x;
        for(int i=0;i<s.length();i++){
x=s.charAt(i);
freq[x]++;
x=s.charAt(i);
freq[x]--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
    }
}
return true;
    }
    public static void main(String[] args) {
        String str = "abc";
        String str1="bdc";
System.out.println(permu(str, str1));
    }
}
