package Pertemuan11.Latihan6;

import Pertemuan11.Latihan2.Graph;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addVertex("A"); // 0
        g.addVertex("B"); // 1
        g.addVertex("C"); // 2
        g.addVertex("D"); // 3
        g.addVertex("E"); // 4

        g.addEdge(0, 1); // A-B
        g.addEdge(0, 3); // A-D
        g.addEdge(1, 2); // B-C
        g.addEdge(2, 4); // C-E
        g.addEdge(3, 4); // D-E

        g.adjacencyMatrix();
    }
}
// OUTPUT TES;