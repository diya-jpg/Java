public class Pig_Latin {
    public  static String toPigLatin(String i){
          String[] words = i.split(" ");
          StringBuilder sb=new StringBuilder();
          for(String word:words){
            if(word.length()>1){
                String converted=word.substring(1)+word.charAt(0)+"ay";
sb.append(converted);
            }
            else {
                sb.append(word.charAt(0)).append("ay");
            }
            sb.append(" ");
          }
          return sb.toString();
    }
    public static void main(String[] args) {
           String input = "I love coding";
        System.out.println(toPigLatin(input));
    }
}
