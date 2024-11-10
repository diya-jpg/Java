import java.util.*;
import java.lang.*;
public class toggleString {
    public static void main(String[] args) {
        String str="PhYSiCS";
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            int asci=(int)ch;
          
            if(asci>=97) flag=false;//samll
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
           }
        }
    }

