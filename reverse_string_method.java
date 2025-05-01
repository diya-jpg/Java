public class reverse_string_method {
    public static String reverse_string(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse_string(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(reverse_string(s));
    }
}
