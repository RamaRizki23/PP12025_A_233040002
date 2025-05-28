package Pertemuan11.Latihan3;

import Pertemuan11.Latihan1.Vertex;
import java.util.ArrayList;

public class AddVertex {
    private ArrayList<Vertex> vertexList;
    private int count;

    public AddVertex() {
        vertexList = new ArrayList<>();
        count = 0;
    }

    public void addVertex(String name) {
        vertexList.add(new Vertex(name));
        count++;
    }

    public void printVertices() {
        for (Vertex v : vertexList) {
            System.out.println(v.name);
        }
    }

    public int getCount() {
        return count;
    }
}
