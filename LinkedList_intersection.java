import org.w3c.dom.Node;

public class LinkedList_intersection {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
    }
}
    public static getintersection(Node headA,Node headB){
         Node temp1=headA;
        Node temp2=headB;
        int count1=0;
        int count2=0;
        while(temp1!=null){
        count1++;
        temp1=temp1.next;
        }
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
temp1=headA;
temp2=headB;
        if(count1>count2){
           int steps=count1-count2;
           for(int i=1;i<=steps;i++){
            temp1=temp1.next;
           }
        }
           else{
             int steps=count2-count1;
           for(int i=1;i<=steps;i++){
            temp2=temp2.next;
           }
           }
           while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
           }
        
        
    
    return temp1;
    }
    public static void main(String[] args) {
        
    }
}
