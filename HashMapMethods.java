import java.util.*;

public class HashMapMethods{
    public static void main(String[] args) {
    Map<String,Integer>mp=new HashMap<>();
    mp.put("Akash",21);
    mp.put("Yash",16);
    mp.put("Rohan",18);
    mp.put("Lav", 17);
    mp.put("Harry",18);
    mp.put("Rohan", 19);
    System.out.println(mp.get("Diya"));
    System.out.println(mp.get("Rohan"));
   System.out.println( mp.remove("Rohan"));
   System.out.println(mp.remove("Diya"));
   System.out.println(mp.containsKey("Rohan"));
   if(!mp.containsKey("Rohan")){
    mp.put("Rohan",20);
   }

   mp.putIfAbsent("Yashika",30);//will enter
   mp.putIfAbsent("Yash",23);//will not print
   System.out.println(mp.keySet());
   System.out.println(mp.values());
   System.out.println(mp.entrySet());
   for (String key : mp.keySet()) {
    System.out.println("Key: " + key + ", Value: " + mp.get(key));
}
System.out.println();
for(Map.Entry<String,Integer>e:mp.entrySet()){
    System.out.println("Key:"+e.getKey()+",Value:"+e.getValue());
}
System.out.println();
for(var e:mp.entrySet()){
    System.out.println("Key:"+e.getKey()+",Value:"+e.getValue());
}
    }
}