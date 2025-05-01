public class longest_word {
    public static String biggest(String sentence){
        String[] words = sentence.split(" ");
      String longest="";
        for(String x:words){
if(x.length()>longest.length()){
 longest=x;
}
        }
    return longest;
    }
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
System.out.println(biggest(str));
    }
}
