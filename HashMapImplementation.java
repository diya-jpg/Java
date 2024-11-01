import java.util.*;
public class HashMapImplementation {
    static class MyHashMap<K,V>{
public static final int DEFAULT_CAPACITY=4;
public static final float DEFAULT_LOAD_FACTOR=0.75f;
private class Node{
    K key;
    V value;
    Node(K key,V value){
        this.key=key;
        this.value=value;
    }
}
private int n;
private LinkedList<Node>[] buckets;
private void initBuckets(int N){
buckets=new LinkedList[N];
for(int i=0;i<buckets.length;i++){
    buckets[i]=new LinkedList<>();
}
}
private int HashFunc(K key){
    int hc=key.hashCode();
    return (Math.abs(hc))%buckets.length;
}
//Traverse the ll and looks for a node with key,if found it returns it's index otherwise it returns null 
private int searchInBucket(LinkedList<Node>ll,K key){
for(int i=0;i<ll.size();i++){
    if(ll.get(i).key==key){
        return i;
    }
}
return -1;
}
public MyHashMap(){
    initBuckets(DEFAULT_CAPACITY);
}
public int capacity(){
    return buckets.length;
}
public float load(){
    return (n*1.0f)/buckets.length;
}
private void rehash(){
    LinkedList<Node>[]oldBuckets=buckets;
    initBuckets(oldBuckets.length*2);
    n=0;
    for(var bucket:oldBuckets){
        for(var node:bucket){
            put(node.key,node.value);
        }
    }
}
public int size(){//returns the number of entries in map
return n;
}
public void put(K key,V value){//insert/update
int bi=HashFunc(key);
LinkedList<Node>currBucket=buckets[bi];
int ei=searchInBucket(currBucket,key);
if(ei==-1){//key doesn't exist
Node node=new Node(key,value);
currBucket.add(node);
n++;
}else{//update case
Node currNode=currBucket.get(ei);
currNode.value=value;
}
if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
    rehash();
}
}
public V get(K key){
int bi=HashFunc(key);
LinkedList<Node>currBucket=buckets[bi];
int ei=searchInBucket(currBucket, key);
if(ei!=-1){//key exists
    Node currNode=currBucket.get(ei);
    return currNode.value;
}
//key doesn't exist
    return null;

}
public V remove(K key){
    //remove the entry for this key from the map
    int bi=HashFunc(key);
LinkedList<Node>currBucket=buckets[bi];
int ei=searchInBucket(currBucket, key);
if(ei!=-1){
    Node currNode=currBucket.get(ei);
V val=currNode.value;
currBucket.remove(ei);
n--;
return val;
}
return null;
}

    }
    public static void main(String[] args) {
        MyHashMap<String,Integer>mp=new MyHashMap<>();
        MyHashMap<String,String>mp2=new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        System.out.println("CAPACITY"+mp.capacity());
System.out.println("LOAD_FACTOR"+mp.load());
        mp.put("x",61);
        mp.put("y",71);
        System.out.println("Testing size"+mp.size());
        mp.put("c",3);
        System.out.println("Testing size"+mp.size());
        //Testing get
        // System.out.println(mp.get("a"));//1
        // System.out.println(mp.get("b"));//2
        // System.out.println(mp.get("c"));//30
        // System.out.println(mp.get("college"));//null
        // System.out.println(mp.remove("c"));//2
        // System.out.println(mp.remove("c"));//null
        // System.out.println("Testing size"+mp.size());//2
System.out.println(mp.get("x"));//1
System.out.println(mp.get("y"));//2
System.out.println("CAPACITY"+mp.capacity());
System.out.println("LOAD_FACTOR"+mp.load());
    }
}
