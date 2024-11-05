import java.util.*;
public class Linked_List_implement {
    public static void insertAtEnd(Node head,int val){
        Node t=head;
        Node new_node=new Node(val);
while(t.next!=null){
    t=t.next;
}
t.next=new_node;
    }
    public static int length(Node head){
       
        int count=0;
        while(head!=null){
            count ++;
          
            head=head.next;
        }
        return count;
    }
    public static void solutionr(Node head){
        if(head==null){
            return;
        }
      System.out.print(head.data+"");
    solutionr(head.next);

    }
    public static void solution(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b=new Node(6);
        Node c=new Node(4);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(23);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

    // solution(a);
      
       System.out.println(length(a));
       insertAtEnd(a,23);
       solutionr(a);
    }
    
}
