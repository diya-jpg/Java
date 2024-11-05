import java.util.*;
public class Isomorphic_Strings {
    public boolean isIsomorphic(String s,String t){
       Map<Character,Character>map=new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);
            if(map.containsKey(sch)){
                if(map.get(sch)!=tch){
return false;
                }
            }
                else if(map.containsValue(tch)){
                    return false;
                }
                else{
                    map.put(sch,tch);
                   
                }
            }
        
        return true;
    }
    public static void main(String[] args) {
       Isomorphic_Strings i=new Isomorphic_Strings();
       String s = "egg", t = "add";
       String s1= "foo", t1 = "bar";
       System.out.println(i.isIsomorphic(s,t));
       System.out.println(i.isIsomorphic(s1,t1));
    }
}
