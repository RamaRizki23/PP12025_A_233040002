package Pertemuan11.Latihan4;

import Pertemuan11.Latihan1.Vertex;

public class adjacencyMatrix {
    private Vertex[] vertexList;
    private int[][] adjMatrix;
    private int count;

    public void adjacencyMatrix() {
        System.out.print("  ");
        for (Vertex v : vertexList) {
            System.out.print(v.name + " ");
        }
        System.out.println();

        for (int i = 0; i < count; i++) {
            System.out.print(vertexList[i].name + " ");
            for (int j = 0; j < count; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}