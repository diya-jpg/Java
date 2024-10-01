import java.util.*;
public class List_ListIterator {
    public static void main(String[]args){
        List <Object> l=new ArrayList<>();
        l.add("A");
        l.add("e");
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
