import java.util.HashSet;
public class Hash {
    public static void main(String[] args) {
        HashSet<String>st=new HashSet<>();  
    st.add("James");
st.add("Scott");
st.add("James");
System.out.println(st); 
System.out.println(st.contains("James")); 
System.out.println(st.size());
st.remove("James");
System.out.println(st.contains("James")); 
st.add("Mark");
System.out.println(st.size());
for(String s:st){
    System.out.println(s);
}
    }

    }
