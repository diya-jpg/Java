public class LinkedList_implement_2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data){
            Node newNode=new Node(data);
           if(head==null){
            head=newNode;
          
           }
           else{
            tail.next=newNode;
          
           }
           tail=newNode;
           size++;
        }
    
    void display(){
        Node temp=head;
        while(temp!=null){
           
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    // int size(){
    //     Node temp=head;
    //     int count=0;
    //     while(temp!=null){
           
    //         count++;
    //         temp=temp.next;
    //     }
    //     return count;
    // }
    void insertAtHead(int data){
Node temp=head;
Node newNode=new Node(data);
if(head==null){
    head=tail=newNode;

}
else{
  
    newNode.next=temp;
    head=newNode;
}
size++;

    }

    void insertAtIndex(int index,int data){
        if(index-1==size){
            insertAtEnd(data);
            return;
        }
        else if(index==1){
            insertAtHead(data);
            return;
        }
        else if(index<=0||index>size){
            System.out.println("Wrong index");
            return ;
        }
      
        Node t=new Node(data);
        Node temp=head;
       
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        size++;
}
int getElement(int index){
    Node temp=head;
     if(index<=0||index>size){
        System.out.println("Wrong index");
        return -1 ;
    }
else{
    for(int i=1;i<=index;i++){
        temp=temp.next;
    }
}
return temp.data;
}
void deleteAtIndex(int index){
    Node temp=head;
    if(index==0){
        head=head.next;
        size--;
        return;
    }
   else{
    for(int i=1;i<index;i++){
        temp=temp.next;
            }
          temp.next=temp.next.next;  
          tail=temp;
          size--;
   }
}
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
    ll.insertAtEnd(1);
    ll.insertAtEnd(2);
    
//    System.out.println("Size of a linked list is "+ ll.size());
   ll.insertAtHead(3);
   ll.insertAtEnd(4);
   ll.insertAtIndex(5,7);
   ll.insertAtIndex(1,8);

   System.out.println("Head of a linked list "+ll.head.data);
   System.out.println("Tail of a linked list "+ll.tail.data);
//ll.insertAtIndex(0,5);

ll.insertAtIndex(8,4);//O(n)
// System.out.println(ll.getElement(-2));
ll.deleteAtIndex(2);
ll.display();
    }
    }
