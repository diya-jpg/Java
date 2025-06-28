public class doubly_ll {
    public static class  Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void displayfromhead(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
      public static void displayfromtail(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
         while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAthead(Node head){
        Node t=new Node(30);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAttail(Node head){

Node newnode=new Node(30);
head.next=newnode;
newnode.prev=head;

    }
    public static void insert_element(Node head,int x,Node y){
        Node temp=head;
    for(int i=1;i<x;i++){
        temp=temp.next;
    }
    y.next=temp.next;
    temp.next.prev=y;
temp.next=y;
y.prev=temp;
    }
    public static void main(String[]args){
        //4 10 2 99 13
        Node a=new Node(4);
         Node b=new Node(10);
         Node c=new Node (2);
         Node d=new Node(99);
         Node e=new Node(13);
         a.prev=null;
         a.next=b;
         b.prev=a;
         b.next=c;
         c.prev=b;
         c.next=d;
         d.prev=c;
         d.next=e;
         e.prev=d;
         Node y=new Node(5);
       displayfromhead(a);
    //    displayfromtail(e);
    //    display2(c);
   Node get=insertAthead(a);
    displayfromhead(get);
    insertAttail(e);
    displayfromhead(a);
    insert_element(a,2,y);
    displayfromhead(a);
    }
}
