public class recursion_array {
    public static int print(int array[]){
        int i=array.length;
      if(i==0){
        return array[0];
      }
        return (print(array[i-1])+array[i]);
       
      
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        print(array);
    }
}
