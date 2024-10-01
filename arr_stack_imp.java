
public class arr_stack_imp {
    public static class Stack{
        private int[]arr=new int[5];
        private int idx=0;
        void push(int x){
arr[idx]=x;
if(isFull()){
    System.out.println("Stack is full");
    return;
}
idx++;
        }
        int peek(){
if(idx==0){
    System.out.println("Stack is empty");
    return -1;

}
return arr[idx-1];     }
    
    int pop(){
        if(idx==0){
            System.out.println("Stack is empty");
            return -1;
        
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
        
        
}
void display(){
    for(int i=0;i<idx;i++){
        System.out.print(arr[i]+" ");
}
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0){
            return true;
        }
return false;    }
boolean isFull(){
    if(idx==arr.length){
        return true;
}
else{
    return false;
}
}
int capacity(){
    return arr.length;
}
    }
   public static void main(String[]args) {
    Stack st=new Stack();
    st.push(4);
    st.push(5);
    st.push(1);
    st.display();
    int y=st.size();
    int z=st.capacity();
    System.out.println("Size of stack is "+y);
    System.out.println("Capacity of stack"+z);
    st.push(6);
    st.push(7);
   
    System.out.println(st.isFull());
   System.out.println( st.isEmpty());
   System.out.println(st.peek());
   
    st.pop();
    System.out.println(st.peek());
    st.display();

   }
}
