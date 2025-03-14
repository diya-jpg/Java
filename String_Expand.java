public class String_Expand {
    public static void expand(String s){
        StringBuffer output=new StringBuffer();
        int i,j,k;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int n=ch-'0';
            StringBuffer temp=new StringBuffer();
            for(j=i+2;s.charAt(j)!=')';j++){
                temp.append(s.charAt(j));
    }
    for( k=1;k<=n;k++){
        output.append(temp);
    }
    i=j;
}
System.out.println(output);
    }
    public static void main(String[] args) {
        expand("3(ab)4(cd)");
    }
}
