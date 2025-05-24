public class pattern10 {
    public static void main(String[] args) {
        int l=5;
      for(int i=0;i<l;i++) //Outer loop for number of rows
   {
      for(int j=0;j<l;j++) //Inner loop for printing stars in each column of a row
         {
            if(i==0 || i==l-1 || j==0 || j==l-1) // condition for printing stars
               {
                  System.out.print("*");
               }
            else                 // else condition to print spaces 
               {
                System.out.print(" ");
               }
         }
         System.out.println();
        }
    }
}

