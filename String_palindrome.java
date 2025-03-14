public class String_palindrome {
    public static boolean palin(String s){
int i=0;
int j=s.length()-1;
while(i<j){
    if(s.charAt(i)!=s.charAt(j)){
        return false;
    }
    i++;
    j--;

}
return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        String str2="naveen";
        System.out.println(palin(str2));
    }
}
