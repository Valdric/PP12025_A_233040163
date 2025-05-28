package pertemuan11;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Tambahkan vertex: A, B, C, D
        graph.addVertex('A'); // index 0
        graph.addVertex('B'); // index 1
        graph.addVertex('C'); // index 2
        graph.addVertex('D'); // index 3

        // Tambahkan edge sesuai gambar
        graph.addEdge(0, 1); // A - B
        graph.addEdge(0, 2); // A - C
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);// A - D

        // Tampilkan adjacency matrix
        graph.adjacencyMatrix();
        System.out.println();
    }
}
