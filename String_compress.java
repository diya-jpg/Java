public class String_compress {
    public static void compress(String str){
        StringBuffer output=new StringBuffer();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            int count=0;
            while(i<str.length() && str.charAt(i)==ch) {
                i++;
                count++;
        }
        output.append(ch);
        if(count>1){
            output.append(count);
        }
    }
    System.out.println(output);
}
    public static void main(String[] args) {
        compress("aaabbccdsa");
    }
}
