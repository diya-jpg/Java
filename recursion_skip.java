public class recursion_skip {
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return " " ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
           return skip2(up.substring(1));
        }
        else{
             return ch+skip2(up.substring(1));
        }
    }
    static String skipapple(String up){
        if(up.isEmpty()){
            
            return "";
        }
       
        if(up.startsWith("apple")){
          return  skipapple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }
    static void skipapple2(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
       char ch=up.charAt(0);
        if(up.startsWith("apple")){
           skipapple2(up.substring(5),p);
        }
        else{
            skipapple2((up.substring(1)),p+ch);
        }
    }
    static String skipappnotapple(String up){
        if(up.isEmpty()){
            
            return "";
        }
       
        if(up.startsWith("app")&&!up.startsWith("apple")){
          return  skipappnotapple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipappnotapple(up.substring(1));
        }
    }
    public static void main(String[] args) {
        // skip("","baccadah");
        // System.out.println(skip2("baccdah"));
        // System.out.println(skipapple("bdapplefg"));
        // skipapple2("bdapplefg","");
        System.out.println(skipappnotapple("bdapplcfg"));
    }
}
