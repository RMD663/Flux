package Nodes;
import RenderServer.DrawQuery;

import java.util.ArrayList;
import java.util.Vector;

public class NodeServer {
    ArrayList<Node> deletionQueue;
    ArrayList<DrawQuery> drawQueries;
    Node tree;

    public NodeServer(){
        tree = new Node();
        drawQueries = new ArrayList<>();
        deletionQueue = new ArrayList<>();
    }

    public void processTree(){
        tree._process();
    }

    public void drawTree(){tree._draw();}

    public void addToTree(Node node){
        for(Node childrenNode : node.getChildren(true)){
            if(childrenNode instanceof DrawableNode){
                DrawableNode dNode = (DrawableNode) childrenNode;
                drawQueries.add(dNode.getDrawQuery());
            }
        }
        tree.addChild(node);
    }

    public void removeFromTree(Node node){
        deletionQueue.add(node);

    }

    public ArrayList<DrawQuery> getDrawQueries(){
        return this.drawQueries;
    }

    public void processDeletionQueue(){
        for (Node node : deletionQueue){
            if (node instanceof DrawableNode) {
                DrawableNode dNode = (DrawableNode) node;
                drawQueries.remove(dNode.getDrawQuery());
            }
        }
        for (Node node : deletionQueue){
            node._processDeletion();
        };

        tree._processDeletion();
        deletionQueue.clear();
    }
}