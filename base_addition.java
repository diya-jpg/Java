public class base_addition {
    public static void main(String []args){
        int a=236,b=754,c=8,carry=0,place=1,sum,x;
        int y=0;
        for (int tempA = a, tempB = b; tempA != 0 ||carry>=1|| tempB != 0 ; tempA /= 10, tempB /= 10) {
            int digitA = tempA % 10; // get the last digit of a
            int digitB = tempB % 10; // get the last digit of b
            sum=digitA+digitB+carry;
          x=sum%c;
         carry=sum/c;

         y+=x*place;
         place *= 10;
    // Print the result



}



   
System.out.println("Result: "+y);}
}

