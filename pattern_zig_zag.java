import java.util.*;
class pattern_zig_zag {

    public static void findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
      HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
      for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
               int key = i + j; // diagonal identifier
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
        }}
       for (var entry : map.entrySet()) {
    List<Integer> list = entry.getValue();

   Collections.reverse(list);

    for (int val : list) {
      System.out.print(val);
    }

    System.out.println();
}
    }
    public static void main(String []args){
       int[][] mat = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

        findDiagonalOrder(mat);
    }
}