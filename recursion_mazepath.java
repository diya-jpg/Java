public class recursion_mazepath {
    public static void main(String[] args) {
        int rows=2;
        int cols=2;
        int count=maze(1,1,rows,cols);
        System.out.println(count);

    }
    private static int maze(int sr,int sc,int er,int ec){
        if(sr==er && sc==ec){
            return 1;
        }
        if(sr>er||sc>ec){
            return 0;
        }
        int downways=maze(sr+1,sc,er,ec);
        int rightways=maze(sr, sc+1, er, ec);
        int totalways=downways+rightways;
        return totalways;
    }
  
}
