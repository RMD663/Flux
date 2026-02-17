package Nodes;
import java.util.Vector;

public class NodeServer {

    Vector<Node> nodes;
    Node tree;

    public NodeServer(){
        tree = new Node();
    }

    public void processTree(){
        tree._process();
    }

    public void drawTree(){tree._draw();}

    public void addToTree(Node node){
        tree.addChild(node);
        
    }

    public void removeFromTree(Node node){
        tree.removeChild(node);
    }
}