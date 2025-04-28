public class pattern6{
        public static void main(String[] args) {
            int count=1;

        for (int i = 1; i <= 3; i++) { 
           for(int j=1;j<=i;j++){
            System.out.print(count);
            
           }
           count++;
           System.out.println();
           for(int k=1;k<=i;k++){
            System.out.print((char)(64+i));
           }
           System.out.println();
        }
    }
}
