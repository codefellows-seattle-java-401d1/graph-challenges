package whiteboard.classes;

import java.util.Set;

public class GetEdge {
    public static String isFlightPossible(Graph<String> inputGraph, String[] cityNames){
        if(inputGraph == null||cityNames == null){
            return("invalid submission");
        }
        int cost = 0;
        for(int i = 0; i < cityNames.length-1; i++){
            try{
                Node currNode = null;
                Node nextNode = null;

                Set<Node<String>> graphContents = inputGraph.getNodes();
                for(Node setNode : graphContents){
                    if(setNode.getData()==cityNames[i]){
                        currNode=setNode;
                    }
                    if(setNode.getData()==cityNames[i+1]){
                        nextNode=setNode;
                    }
                }
                if(inputGraph.getNeighbors(currNode).contains(nextNode)){
                    cost = cost + inputGraph.getEdge(currNode,nextNode).getCost();
                }else{
                    return "invalid flight";
                }
            }catch(Exception e){
                return "invalid flight";
            }
        }
        String returnVal = "" + cost;
        return returnVal;
    }
}
