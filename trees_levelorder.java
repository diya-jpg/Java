import java.util.*;
import java.util.Stack;



public class trees_levelorder {
     private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
        public Node(int data) {
            this.data = data;
        }
        public Node(){

        }
    }
    public static void level(Node node){
        Queue<Node>q=new ArrayDeque<>();
        q.add(node);
        while(q.size()>0){
node=q.remove();
System.out.println(node.data);
for(Node child:node.children){
    q.add(child);
}
System.out.println(".");
        }
    }
    public static void levelorderLinewise(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        Queue<Node>cq=new ArrayDeque<>();
        while(mq.size()>0){
            node=mq.remove();
            System.out.print(node.data+" ");
            for(Node child:node.children){
                cq.add(child);
            }
            if(mq.size()==0){
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println();
            }
    }
}
public static void levelorderLinewise2(Node node){
    Queue<Node> mq = new ArrayDeque<>();
    mq.add(node);
    mq.add(new Node(-1));
 
    while(mq.size()>0){
        node=mq.remove();
       if(node.data!=-1){
        System.out.print(node.data+" ");
        for(Node child:node.children){
            mq.add(child);
        }
       }
       else{
       if(mq.size()>0){
        mq.add(new Node(-1));
        System.out.println();
       }
       }
      
}
}
public static void levelorderLinewise3(Node node){
    Queue<Node> mq = new ArrayDeque<>();
    mq.add(node);
  
 
    while(mq.size()>0){
     int cicl=mq.size();
     for(int i=0;i<cicl;i++){
        node=mq.remove();
        System.out.print(node.data+" ");
        for(Node child:node.children){
            mq.add(child);
        }
     }
     System.out.println();
}
}
private static class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
public static void levelorderLinewise4(Node node){
    Queue<Pair> mq = new ArrayDeque<>();
    mq.add(new Pair(node,1));
   int level=1;
 
    while(mq.size()>0){
      Pair p=mq.remove();
      if(p.level>level){
        level=p.level;
        System.out.println();
      }
      System.out.print(p.node.data+" ");
      for(Node child:p.node.children){
        Pair cp=new Pair(child,p.level+1);
        mq.add(cp);
      }
}
}
public static void levelorderZigzag(Node node){
    Queue<Node> mq = new ArrayDeque<>();
    mq.add(node);
  Stack<Node>cq=new Stack<>();
    while(mq.size()>0){
        node=mq.remove();
        System.out.print(node.data+" ");
        for(Node child:node.children){
            cq.add(child);
        }
        if(mq.size()==0){
            while(cq.size()>0){
mq.add(cq.pop());
            }
            cq=new Stack<>();
            System.out.println();
        }
}
}
    public static void main(String[] args) {
         int arr[]={10,20,-1,30,50,-1,60,-1,-1,40,-1};
          Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    Node parent = st.peek();
                    parent.children.add(t);
                } else {
                    root = t; 
                }
                st.push(t);
            }
        }
// level(root);
// levelorderLinewise(root);
// levelorderZigzag(root);
// levelorderLinewise2(root);
levelorderLinewise3(root);
levelorderLinewise4(root);

}
}
