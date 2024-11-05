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
//     public boolean isAnagram(String s, String t) {
//           if(s.length()!=t.length()){
//             return false;
//         }
//         Map<Character,Integer>map1=hash(s);
//   Map<Character,Integer>map2=hash(t);
 
//   return map1.equals(map2);
//     }
public boolean isAnagram(String s,String t){
    if(s.length()!=t.length()){
                   return false;
               }
               Map<Character,Integer>map1=hash(s);
               for(int i=0;i<t.length();i++){
                Character ch=t.charAt(i);
if(!map1.containsKey(ch)){
return false;
}
int currFreq=map1.get(ch);
map1.put(ch,currFreq-1);
               }
               for(var i:map1.values()){
                if(i!=0){
                    return false;
               }
              }
              return true;        
}
   public static void main(String[] args) {
    Valid_Anagram st=new Valid_Anagram();
    String s="listen";
    String t="silent";
    String s1="get";
    String t1="ge";
    System.out.println(st.isAnagram(s,t));
    System.out.println(st.isAnagram(s1, t1));
   }
    }
