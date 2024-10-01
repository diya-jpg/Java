import java.util.ArrayList;
public class Arr_List1{
    public static void main(String[]args){
        ArrayList<Object>al=new ArrayList<>();
        al.add("Hi");
        al.add(1);
        System.out.println(al);
        ArrayList<Object>al2=new ArrayList<>();
        al2.add("Hello");
        al2.add(2);
        System.out.println(al2);
        al.addAll(al2);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.contains("Hi"));
        System.out.println(al.add("x"));
        System.out.println(al);
        System.out.println(al.size());
        al.remove("x");
        System.out.println(al);
    }
}
