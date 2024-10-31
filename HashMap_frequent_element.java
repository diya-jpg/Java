import java.util.*;
public class HashMap_frequent_element {
public static int freq(int arr[]){
    int maxfreq=0;
    int anskey=-1;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
    else{
        map.put(arr[i],1);
    }
  
//     for(var e:map.entrySet()){
// if(maxfreq<e.getValue()){
//     maxfreq=e.getValue();
//     anskey=e.getKey();
// }
//     }
for(var e:map.keySet()){
if(maxfreq<map.get(e)){
    maxfreq=map.get(e);
    anskey=e;
}
}
}
return anskey;
}
    public static void main(String[] args) {
        int arr[]={1,3,2,1,4,1};
       int x= freq(arr);
       System.out.println(x);
    }
}
