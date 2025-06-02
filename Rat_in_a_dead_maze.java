public class Rat_in_a_dead_maze {
    public static void main(String[] args) {
          int rows=3;
        int cols=3;
        
      int[][]maze={{1,0,1,1,1,1},{1,1,1,1,0,1},{0,1,1,1,1,1},{
        0,0,1,0,1,1
      }

      };
      print(1,1,rows,cols,"",maze);
    }
    private static void print(int sr,int sc,int er,int ec,String s,int [][]maze){
 if (sr > er || sc > ec) {
            return;
        }

        if (sr == er && sc == ec) {
            System.out.println(s); 
            return;
        }
        if(maze[sr][sc]==0)return;
print(sr+1,sc,er,ec,s+"D",maze);
print(sr,sc+1,er,ec,s+"R",maze);
  }
}
