import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class total_operators {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the filename");
    String filename=sc.nextLine();
    File file=new File(filename);
    if(!file.exists()){
        System.out.println("File not found");
    }
    int count=0;
    try (Scanner fileScanner=new Scanner(file)){
        while(fileScanner.hasNext()){
            //String line=fileScanner.nextLine();
            // if(isOperator(line)){
            //     count++;
            // }
            String line = fileScanner.nextLine();
            for (char c : line.toCharArray()) {
                String word = String.valueOf(c);
                if (isOperator(word)) {
                    count++;
                }
            }
    }
   
  }
  catch(FileNotFoundException e){
    System.out.println("File not found"+e.getMessage());
}
System.out.println("Total number of operators"+count);
}

public static boolean isOperator(String word){
    String[]operator={"+","-","*","=="};
    for(int i=0;i<operator.length;i++){
        if(operator[i].equals(word)){
return true;
        }
    }
        return false;
    
}
}


  
