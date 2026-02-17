package Nodes;
import java.util.ArrayList;
import java.util.Vector;

public class NodeServer {
    ArrayList<Node> deletionQueue;
    Vector<Node> nodes;
    Node tree;

    public NodeServer(){
        tree = new Node();
        deletionQueue = new ArrayList<>();
    }

    public void processTree(){
        tree._process();
    }

    public void drawTree(){tree._draw();}

    public void addToTree(Node node){
        tree.addChild(node);
        
    }

    public void removeFromTree(Node node){
        deletionQueue.add(node);
    }

    public void processDeletionQueue(){
        deletionQueue.clear();
    }
}