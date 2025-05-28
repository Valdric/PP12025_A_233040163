package pertemuan11;

public class Graph {
    private final int maxVerts = 20;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts;

    public Graph() {
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        // Inisialisasi matriks dengan 0
        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacencyMatrix() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
