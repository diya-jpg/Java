public class pattern_reverse {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
           for (int j=5-i; j>1; j--) 
	                System.out.print(" "); 
	            for (int j=0; j<i; j++ ) 
	                System.out.print(" *"); 
	            System.out.println(); 
        }
        System.out.println();
         for(int i=5;i>0;i--){
           for (int j=5; j>i; j--) 
	                System.out.print(" "); 
	            for (int j=i; j>0; j-- ) 
	                System.out.print(" *"); 
	            System.out.println(); 
        }
        for(int i=5;i>=1;i--)
	     {
	        
	         for(int j=i;j<5;j++)
	            System.out.print(" ");
	         
	         for(int j=1;j<=(2*i-1);j++)
	            System.out.print("*");
	         
	       System.out.println("");
	     } 
    }
}
