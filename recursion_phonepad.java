import java.util.ArrayList;

public class recursion_phonepad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(phonepad2("","12" ));
        System.out.println(padcount("", "12"));
    }
    static void pad(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
    }
    int digit=up.charAt(0)-'0';//this will convert '2' into 2
for(int i=(digit-1)*3;i<digit*3;i++){
    char ch=(char)('a'+i);
    pad(p+ch,up.substring(1));
}
}
static ArrayList<String> phonepad2(String p,String uo ){
    if(uo.length()==0){
    ArrayList<String>list=new ArrayList<>();
    list.add(p);
    return list;
    }
        int digit=uo.charAt(0)-'0';//this will convert '2'into2
        ArrayList<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(phonepad2(p+ch,uo.substring(1)));
        }
        
     return ans;   
}

static int padcount(String p,String up){
    if(up.length()==0){
       return 1;
}
int count=0;
int digit=up.charAt(0)-'0';//this will convert '2' into 2
for(int i=(digit-1)*3;i<digit*3;i++){
char ch=(char)('a'+i);
count=count+padcount(p+ch,up.substring(1));
}
return count;
}

}
