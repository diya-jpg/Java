import java.util.*;
public class recursion_permutations {
    static void permutations(String p, String uo) {
        if (uo.length() == 0) {
            System.out.println(p);
            return;
        }
        char ch = uo.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, uo.substring(1));
        }
    }

static ArrayList<String> permutations2(String p,String uo ){
    if(uo.length()==0){
    ArrayList<String>list=new ArrayList<>();
    list.add(p);
    return list;
    }
        char ch=uo.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           ans.addAll( permutations2(f+ch+s,uo.substring(1)));
        }
     return ans;   
}
static int permutationscount(String p,String uo ){
    if(uo.length()==0){
        return 1;}
        int count=0;
        char ch=uo.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+permutationscount(f+ch+s,uo.substring(1));
        }
        return count;
}

    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println(permutations2("", "abc"));
    System.out.println(permutationscount("", "abc"));
    }
}
