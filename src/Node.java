import java.awt.Graphics2D;
import java.util.Vector;

public class Node {
    Vector<Node> children = new Vector<>();
    String id;
    private boolean isActive = true;
    private boolean isDrawable = false;
    public Node owner;
    enum NodeType {NODE, TRANSLATION, SPRITE}
    public NodeType type; 
    
    Node(){
    }

    public final void _process(){
        if (!isActive) return;


        this.onProcess();
        for (Node node : children) {
            node._process();
        }

    }

    public void _draw(Graphics2D g2D){}

    public void onDraw(){

    }

    public void onProcess(){

    }

    public void addChild(Node child) {
        child.owner = this;
        children.add(child);
    }

    public void removeChild(Node child) {
        children.remove(child);
    }

    public Vector<Node> getChildren(boolean getInternal) {
        if(!getInternal){
            return children;
        }  else {
            Vector<Node> internalChildren = new Vector<>();
            internalChildren = collectAllChildren(internalChildren);
            return internalChildren;
        }
        

    }

    public Vector<Node> getChildren() {
        return children;
    }


    public boolean hasChildren() {
        return children.size() > 0 ? true : false;
    }

    private Vector<Node> collectAllChildren(Vector<Node> list){
        for (Node node : children) {
            list.add(node);
            if(node.hasChildren()){
                node.collectAllChildren(list);
            } 
        }
        return list;
    }
}