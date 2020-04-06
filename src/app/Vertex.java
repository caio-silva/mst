package app;

import java.util.ArrayList;

// Vertex (name): This constructor creates a new vertex by just assigning it the
// name ‘name’ and creating a new instance of the adjacency list.
public class Vertex {
    public String name;
    public ArrayList<Edge> adjlist;

    public Vertex(String _name) {
        this.name = _name;
        this.adjlist = new ArrayList<Edge>();
    }
}
