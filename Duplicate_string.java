import java.util.*;
public class Duplicate_string {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        String []input={"Green","Red","Red","Blue","Green"};
        for(int i=0;i<input.length;i++){
            if(set.contains(input[i])){
                System.out.println("Duplicate is "+input[i]);
            }
            else{
                set.add(input[i]);
            }
        }
    }
}
