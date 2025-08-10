public class pattern_E {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
          int stars;
          if(i==0||i==6){
            stars=7;
          }
          
          else if(i==1||i==5){
            stars=1;
          }
          else if(i==2||i==4){
            stars=5;
          }
          else{
            stars=4;
          }
          for(int j=0;j<stars;j++){
            System.out.print("*");
          }
          System.out.println();
        }
System.out.println();
         for(int i=0;i<7;i++){
          int stars;
          if(i==0||i==3||i==6){
            stars=7;
          }
          else{
            stars=1;
          }
          for(int j=0;j<stars;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
