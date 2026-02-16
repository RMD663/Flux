package Node;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Node {
    ArrayList<Node> children = new ArrayList<>();
    String id;
    private boolean isActive = true;
    
    @SuppressWarnings("unused")
    private boolean isDrawable = false;
    public Node owner;
    enum NodeType {NODE, TRANSLATION, SPRITE}
    public NodeType type; 
    
    public Node(){
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

    public ArrayList<Node> getChildren(boolean getInternal) {
        if(!getInternal){
            return children;
        }  else {
            ArrayList<Node> internalChildren = new ArrayList<>();
            internalChildren = collectAllChildren(internalChildren);
            return internalChildren;
        }
        

    }

    public ArrayList<Node> getChildren() {
        return children;
    }


    public boolean hasChildren() {
        return children.size() > 0 ? true : false;
    }

    private ArrayList<Node> collectAllChildren(ArrayList<Node> list){
        for (Node node : children) {
            list.add(node);
            if(node.hasChildren()){
                node.collectAllChildren(list);
            } 
        }
        return list;
    }
}