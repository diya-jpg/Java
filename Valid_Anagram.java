import java.util.*;
class Valid_Anagram {
    public static Map<Character,Integer> hash(String s){
        Map<Character,Integer>map=new HashMap<>();
        
         for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(!map.containsKey(ch)){
            map.put(ch,1);
        }
        else{
            int currFreq=map.get(ch);
            map.put(ch,currFreq+1);
        }
          
     
    }
       return map;
    }
    public boolean isAnagram(String s, String t) {
          if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>map1=hash(s);
  Map<Character,Integer>map2=hash(t);
 
  return map1.equals(map2);
    }
   public static void main(String[] args) {
    Valid_Anagram st=new Valid_Anagram();
    String s="listen";
    String t="silent";
    System.out.println(st.isAnagram(s,t));
   }
    }
