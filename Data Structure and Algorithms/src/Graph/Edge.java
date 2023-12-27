package Graph;

public class Edge {
    int source;
    int destination;
    int weight;
    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
