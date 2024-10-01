import java.util.*;
public class List_Set {
   public static void main(String[]args){
    List<Object> l=new ArrayList<>();
    Set<Object> s=new HashSet<>();
    l.add(0, "Hi");
    l.add(1, "Hello");
l.add("Hi");
   // System.out.println(l);
//    Iterator itr=l.iterator();
//    while(itr.hasNext()){
//    System.out.println(itr.next());
// }
ListIterator<Object> itr3 = l.listIterator();
       
// Move forward first
while (itr3.hasNext()) {
    System.out.println(itr3.next());
}

// Now move backward
while (itr3.hasPrevious()) {
    System.out.println(itr3.previous());
}
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(3);
    //System.out.println(s);
    Iterator itr2=s.iterator();
    while(itr2.hasNext()){
    System.out.println(itr2.next());
 }
   }

}
