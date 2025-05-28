package Pertemuan11.Latihan2;

import java.util.*;

import Pertemuan11.Latihan1.Vertex;

public class Graph {
    private ArrayList<Vertex> vertexList;
    private int[][] adjMatrix;
    private int count;

    public Graph(int maxVertices) {
        vertexList = new ArrayList<>();
        adjMatrix = new int[maxVertices][maxVertices];
        count = 0;
    }

    public void addVertex(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addVertex'");
    }

    public void addEdge(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEdge'");
    }

    public void adjacencyMatrix() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adjacencyMatrix'");
    }
}