import java.util.*;
public class recursion_subseq {
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subseq2(String p,String up){
        if(up.isEmpty()){
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseq2(p+ch, up.substring(1));
       ArrayList <String>right=subseq2(p,up.substring(1));
    left.addAll(right);
    return left;
    }
    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subseqAscii2(String p,String up){
        if(up.isEmpty()){
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String>first=subseqAscii2(p+ch, up.substring(1));
        ArrayList<String>second=subseqAscii2(p,up.substring(1));
        ArrayList<String>third=subseqAscii2(p+(ch+0),up.substring(1));
   first.addAll(second);
   first.addAll(third);
   return first;
    }

    public static void main(String[] args) {
        subseq("", "abc");

        ArrayList <String>p=subseq2("", "abc");
        System.out.println(p);
        subseqAscii("","abc");
        System.out.println(subseqAscii2("","abc"));
    }
}
