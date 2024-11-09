import java.util.*;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");//capacity by default 16
    str.append("World");
    System.out.println(str);
   str.setCharAt(0, 'm');
   System.out.println(str);
   str.append(3);
   str.insert(1,2);
   
   str.deleteCharAt(0);
   System.out.println(str);
   StringBuilder s=new StringBuilder("physics");
   s.reverse();
   s.reverse();
   System.out.println(s);
   s.delete(2,4);//2 include 4 excludeed
   System.out.println(s);
    }
}
