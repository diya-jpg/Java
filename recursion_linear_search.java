import java.util.*;
public class recursion_linear_search {
    public static int get(int arr[],int index,int target){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
       return get(arr,index+1,target);
    }
    public static int getfromlast(int arr[],int index,int target){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
       return get(arr,index-1,target);
    }
    public static ArrayList findAllIndex(int arr[],int target,int index,ArrayList<Integer>list){
        if(arr.length==index){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
    public static ArrayList<Integer> findAllIndex2(int arr[],int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(arr.length==index){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>list2= findAllIndex2(arr, target, index+1);
        list.addAll(list2);
        return list;
    }
       public static void main(String[] args) {
        int arr[]={1,2,3,4,4};
        int t=4;
       System.out.println( get(arr,0,t));
       System.out.println( getfromlast(arr,arr.length-1,t));
       ArrayList<Integer>list=new ArrayList<>();
System.out.println(findAllIndex(arr,t,0,list));
System.out.println(findAllIndex2(arr,t,0));


    }
}
