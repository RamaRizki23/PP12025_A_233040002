package Pertemuan11.Latihan3;

public class addEdge {
    private int[][] adjMatrix;

    public addEdge(int size) {
        adjMatrix = new int[size][size];
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1; // untuk undirected graph
    }
}
