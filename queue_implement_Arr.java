public class queue_implement_Arr {
    public static class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=0;
                r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size ++;
        }
        public int remove(){
            if(f==-1){
                System.out.println("Queue is empty");
                return -1;
        }
        else{
            
            f++;
            size--;

            
            return arr[f];
        }
    }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
                System.out.println("");
            }
        }
        public int  peek(){
            if(f==-1){
System.out.println(" element is not there");
            }
            return arr[f];
        }
        public boolean Empty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        queue q=new queue();
   
       System.out.println( q.Empty());
        q.add(5);
        q.add(4);
        q.add(3);
      
        System.out.println( q.Empty());
        q.display();
int x=q.remove();
System.out.println("Remove element:"+x);
q.display();
int y=q.peek();
System.out.println(y);
System.out.println(q.size);
    }
}

