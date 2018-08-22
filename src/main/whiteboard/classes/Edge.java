package whiteboard.classes;

public class Edge<E> {
    private int cost;
    private Node<E> start;
    private Node<E> end;

    public Edge(Node<E> start, Node<E> end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    public Node<E> getStart() {
       return start;
    }

    public Node<E> getEnd() {
        return end;
    }

    public int getCost() {
        return this.cost;
    }
}
