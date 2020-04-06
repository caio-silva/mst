package app;

// Edge(from, to, weight): This constructor 
// creates a new edge by assigning it an 
// origin vertex (from), a destination vertex (to) and a weight.

public class Edge {
    public Vertex from, to;
    public int weight;

    public Edge(Vertex _from, Vertex _to, int _weight) {
        this.from = _from;
        this.to = _to;
        this.weight = _weight;
    }
}
