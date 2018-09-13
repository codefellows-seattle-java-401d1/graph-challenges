package whiteboard.classes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GetEdgeTest {
    private Graph<String> washington;
    private Node<String> bellingham;
    private Node<String> seattle;
    private Node<String> tacoma;
    private Node<String> olympia;
    private Node<String> vancouver;
    private Node<String> ellensberg;
    private Node<String> spokane;
    private Node<String> yakima;
    private Node<String> richland;
    private Node<String> wallaWalla;

    // node used to check for non-existent nodes that haven't been added to graph
    private Node<String> unadded;

//    @BeforeAll
//    static void beforeAll(){
//        washington = new AdjacencyListGraph<>();
//        bellingham = new Node<>("Bellingham");
//        seattle = new Node<>("Seattle");
//        tacoma = new Node<>("Tacoma");
//        olympia = new Node<>("Olympia");
//        vancouver = new Node<>("Vancouver");
//        ellensberg = new Node<>("Ellensberg");
//        spokane = new Node<>("Spokane");
//        yakima = new Node<>("Yakima");
//        richland = new Node<>("Richland");
//        wallaWalla = new Node<>("Walla Walla");
//
//        unadded = new Node<>("unadded");
//
//        // I-5 north to south
//        washington.addNode(bellingham);
//        washington.addNode(seattle);
//        washington.addNode(tacoma);
//        washington.addNode(olympia);
//        washington.addNode(vancouver);
//
//        // I-90 west to east
//        washington.addNode(ellensberg);
//
//        // north east of ellensberg
//        washington.addNode(spokane);
//
//        // south east of ellensberg
//        washington.addNode(yakima);
//        washington.addNode(richland);
//        washington.addNode(wallaWalla);
//
//        washington.addTwoWayEdge(bellingham, seattle, 88);
//        washington.addTwoWayEdge(seattle, tacoma, 33);
//        washington.addTwoWayEdge(tacoma, olympia, 38);
//        washington.addTwoWayEdge(olympia, vancouver, 109);
//
//        // east from seattle to ellensberg
//        washington.addTwoWayEdge(seattle, ellensberg, 107);
//
//        // ellensberg splits east to spokane and south to yakima
//        washington.addTwoWayEdge(ellensberg, spokane, 172);
//        washington.addTwoWayEdge(ellensberg, yakima, 39);
//
//        // yakima goes south east to richland
//        // you can split and go to either spokane or walla walla from richland
//        washington.addTwoWayEdge(yakima, richland, 77);
//        washington.addTwoWayEdge(richland, wallaWalla, 57);
//        washington.addTwoWayEdge(richland, spokane, 144);
//    }

    @org.junit.jupiter.api.Test
    void isFlightPossibleVoid() {
        washington = new AdjacencyListGraph<>();
        bellingham = new Node<>("Bellingham");
        seattle = new Node<>("Seattle");
        tacoma = new Node<>("Tacoma");
        olympia = new Node<>("Olympia");
        vancouver = new Node<>("Vancouver");
        ellensberg = new Node<>("Ellensberg");
        spokane = new Node<>("Spokane");
        yakima = new Node<>("Yakima");
        richland = new Node<>("Richland");
        wallaWalla = new Node<>("Walla Walla");

        unadded = new Node<>("unadded");

        // I-5 north to south
        washington.addNode(bellingham);
        washington.addNode(seattle);
        washington.addNode(tacoma);
        washington.addNode(olympia);
        washington.addNode(vancouver);

        // I-90 west to east
        washington.addNode(ellensberg);

        // north east of ellensberg
        washington.addNode(spokane);

        // south east of ellensberg
        washington.addNode(yakima);
        washington.addNode(richland);
        washington.addNode(wallaWalla);

        washington.addTwoWayEdge(bellingham, seattle, 88);
        washington.addTwoWayEdge(seattle, tacoma, 33);
        washington.addTwoWayEdge(tacoma, olympia, 38);
        washington.addTwoWayEdge(olympia, vancouver, 109);

        // east from seattle to ellensberg
        washington.addTwoWayEdge(seattle, ellensberg, 107);

        // ellensberg splits east to spokane and south to yakima
        washington.addTwoWayEdge(ellensberg, spokane, 172);
        washington.addTwoWayEdge(ellensberg, yakima, 39);

        // yakima goes south east to richland
        // you can split and go to either spokane or walla walla from richland
        washington.addTwoWayEdge(yakima, richland, 77);
        washington.addTwoWayEdge(richland, wallaWalla, 57);
        washington.addTwoWayEdge(richland, spokane, 144);

        String[] names = null;
        assertTrue(GetEdge.isFlightPossible(washington,names).equals("invalid submission"));
    }
    @org.junit.jupiter.api.Test
    void isFlightPossibleTrue() {
        washington = new AdjacencyListGraph<>();
        bellingham = new Node<>("Bellingham");
        seattle = new Node<>("Seattle");
        tacoma = new Node<>("Tacoma");
        olympia = new Node<>("Olympia");
        vancouver = new Node<>("Vancouver");
        ellensberg = new Node<>("Ellensberg");
        spokane = new Node<>("Spokane");
        yakima = new Node<>("Yakima");
        richland = new Node<>("Richland");
        wallaWalla = new Node<>("Walla Walla");

        unadded = new Node<>("unadded");

        // I-5 north to south
        washington.addNode(bellingham);
        washington.addNode(seattle);
        washington.addNode(tacoma);
        washington.addNode(olympia);
        washington.addNode(vancouver);

        // I-90 west to east
        washington.addNode(ellensberg);

        // north east of ellensberg
        washington.addNode(spokane);

        // south east of ellensberg
        washington.addNode(yakima);
        washington.addNode(richland);
        washington.addNode(wallaWalla);

        washington.addTwoWayEdge(bellingham, seattle, 88);
        washington.addTwoWayEdge(seattle, tacoma, 33);
        washington.addTwoWayEdge(tacoma, olympia, 38);
        washington.addTwoWayEdge(olympia, vancouver, 109);

        // east from seattle to ellensberg
        washington.addTwoWayEdge(seattle, ellensberg, 107);

        // ellensberg splits east to spokane and south to yakima
        washington.addTwoWayEdge(ellensberg, spokane, 172);
        washington.addTwoWayEdge(ellensberg, yakima, 39);

        // yakima goes south east to richland
        // you can split and go to either spokane or walla walla from richland
        washington.addTwoWayEdge(yakima, richland, 77);
        washington.addTwoWayEdge(richland, wallaWalla, 57);
        washington.addTwoWayEdge(richland, spokane, 144);
        String[] names = {"Bellingham","Seattle"};
        assertTrue(GetEdge.isFlightPossible(washington,names).equals("88"));
    }
    @org.junit.jupiter.api.Test
    void isFlightPossibleFalse() {
        washington = new AdjacencyListGraph<>();
        bellingham = new Node<>("Bellingham");
        seattle = new Node<>("Seattle");
        tacoma = new Node<>("Tacoma");
        olympia = new Node<>("Olympia");
        vancouver = new Node<>("Vancouver");
        ellensberg = new Node<>("Ellensberg");
        spokane = new Node<>("Spokane");
        yakima = new Node<>("Yakima");
        richland = new Node<>("Richland");
        wallaWalla = new Node<>("Walla Walla");

        unadded = new Node<>("unadded");

        // I-5 north to south
        washington.addNode(bellingham);
        washington.addNode(seattle);
        washington.addNode(tacoma);
        washington.addNode(olympia);
        washington.addNode(vancouver);

        // I-90 west to east
        washington.addNode(ellensberg);

        // north east of ellensberg
        washington.addNode(spokane);

        // south east of ellensberg
        washington.addNode(yakima);
        washington.addNode(richland);
        washington.addNode(wallaWalla);

        washington.addTwoWayEdge(bellingham, seattle, 88);
        washington.addTwoWayEdge(seattle, tacoma, 33);
        washington.addTwoWayEdge(tacoma, olympia, 38);
        washington.addTwoWayEdge(olympia, vancouver, 109);

        // east from seattle to ellensberg
        washington.addTwoWayEdge(seattle, ellensberg, 107);

        // ellensberg splits east to spokane and south to yakima
        washington.addTwoWayEdge(ellensberg, spokane, 172);
        washington.addTwoWayEdge(ellensberg, yakima, 39);

        // yakima goes south east to richland
        // you can split and go to either spokane or walla walla from richland
        washington.addTwoWayEdge(yakima, richland, 77);
        washington.addTwoWayEdge(richland, wallaWalla, 57);
        washington.addTwoWayEdge(richland, spokane, 144);

        String[] names = {"Bellingham","Ellensberg"};
        assertTrue(GetEdge.isFlightPossible(washington,names).equals("invalid flight"));
    }
}