import java.util.Arrays;

public class graph_representation {
    int adjMatrix[][];

    graph_representation(int nodes) {
        adjMatrix = new int[nodes][nodes];
    }

    
    public void addEdgesinMatrix(int edges[][], boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (isDirected) {
                adjMatrix[u][v] = 1;
            } else {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }
    public void addEdgesinMatrixwithweight(int edges[][], boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
    int w=edge[2];
            if (isDirected) {
                adjMatrix[u][v] = w;
            } else {
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }
    
    void printMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

 
    public static void main(String[] args) {
        int edges[][] = { { 0, 2,10 }, { 0, 1,20 }, { 1, 3,30 } }; 
        int nodes = 4;

       
        graph_representation graph = new graph_representation(nodes);

     
        graph.addEdgesinMatrix(edges, true);

      
        System.out.println("Adjacency Matrix:");
        graph.printMatrix();
        System.out.println();
        graph_representation graph2 = new graph_representation(nodes);

        graph2.addEdgesinMatrixwithweight(edges, true);
        graph2.printMatrix();
    }
}
