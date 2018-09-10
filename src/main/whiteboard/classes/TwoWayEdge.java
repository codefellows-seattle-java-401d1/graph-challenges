package whiteboard.classes;

public class TwoWayEdge<E> {
    Node<E> node1;
    Node<E> node2;
    int val;
    TwoWayEdge(Node<E> node1, Node<E> node2){
        new TwoWayEdge(node1,node2,0);
    }
    TwoWayEdge(Node<E> node1, Node<E> node2, int val){
        this.node1 = node1;
        this.node2 = node2;
        this.val = val;
    }
}
