package whiteboard.classes;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.*;

public class AdjacencyListGraph<E> implements Graph<E> {
    Set<Node<E>> nodes = new HashSet<Node<E>>();
    Set<Edge<E>> edges = new HashSet<Edge<E>>();

    public AdjacencyListGraph() {
    }

    public Set<Node<E>> getNodes() {
        return this.nodes;
    }

    public Set<Edge<E>> getEdges() {
        return this.edges;
    }

    @Override
    public void addNode(Node<E> node) {
        this.nodes.add(node);
    }

    @Override
    public void addEdge(Node<E> start, Node<E> end) {
        addEdge(start,end,0);
    }

    @Override
    public void addEdge(Node<E> start, Node<E> end, int cost) {
        try {
            this.edges.add(new Edge<>(start, end, cost));
        }catch(Exception exc1){
            throw exc1;
        }
    }

    @Override
    public void addTwoWayEdge(Node<E> start, Node<E> end) {
        addTwoWayEdge(start,end,0);
    }

    @Override
    public void addTwoWayEdge(Node<E> start, Node<E> end, int cost) {
        try {
            addEdge(start, end, cost);
            addEdge(end, start, cost);
        }catch(Exception exc1){
            throw exc1;
        }
    }

    @Override
    public Set<Node<E>> getNeighbors(Node<E> node) {
        Set<Node<E>> returnSet = new HashSet<>();
        for(Edge currEdge: getEdges()){
            if(node==currEdge.getEnd()){
                returnSet.add(currEdge.getStart());
            }
            if(node==currEdge.getStart()){
                returnSet.add(currEdge.getEnd());
            }
        }
        return returnSet;
    }

    @Override
    public boolean isConnected(Node<E> start, Node<E> end) {
        try {
            for (Edge currEdge : getEdges()) {
                if (end == currEdge.getEnd()) {
                    if (start == currEdge.getStart()) {
                        return true;
                    }
                }
            }
            return false;
        } catch(Exception exc1){
            throw exc1;
        }
    }

    @Override
    public Edge<E> getEdge(Node<E> start, Node<E> end) {
        try {
            for (Edge currEdge : getEdges()) {
                if (end == currEdge.getEnd()) {
                    if (start == currEdge.getStart()) {
                        return currEdge;
                    }
                }
            }
            return null;
        }catch(Exception exc1){
            throw exc1;
        }
    }

    public List<Node> preorderTraversal(){
        LinkedList returnVal = new LinkedList<Node>();
        LinkedList<Node> seen = new LinkedList<Node>();
        Set<Node<E>> nodes = this.getNodes();
        return(_preorderTraversal(nodes.iterator().next(),seen,returnVal));

    }
    public List<Node> _preorderTraversal(Node input, LinkedList<Node> seen, LinkedList<Node> returnVal){
        seen.add(input);
        Set<Node> Set = this.getNeighbors(input);
        for(Node curr : Set){
            if(!seen.contains(curr)){
                _preorderTraversal(curr,seen, returnVal);
            }
        }
        returnVal.add(input);
        return returnVal;
    }

    private void checkNodesExists(Node<E> node1, Node<E> node2) {
    }

    // leverage method overloading and use plural naming even for the single node check
    // because it's way easier to write the same method name everywhere than to remember to
    // write either "node" vs "nodes" in "checkNodeExists" or "checkNodesExists"
    private void checkNodesExists(Node<E> node) {
    }
}
